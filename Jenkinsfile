pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                mvn clean compie
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }

    }
}