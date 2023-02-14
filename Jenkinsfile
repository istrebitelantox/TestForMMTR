pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn compile'
                sh 'mvn test'
            }
        }
    }
}
