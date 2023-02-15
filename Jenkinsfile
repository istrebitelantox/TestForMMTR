pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn test'
                allure '**/target/allure-results/*-result.json'
            }
        }
    }
}
