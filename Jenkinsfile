pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn test'
                echo '**/target/allure-results/*-result.json'
            }
        }
    }
}
