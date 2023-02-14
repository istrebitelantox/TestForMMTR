pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
                // bat '.\\mvnw clean compile'
            }
        }
    }
}
