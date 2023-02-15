pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn test'
                echo '**/target/allure-results/*-result.json'
            }
        }
        stage('reports') {
            steps {
            script {
                    allure([
                            includeProperties: false,
                            jdk: '',
                            properties: [],
                            reportBuildPolicy: 'ALWAYS',
                            results: [[path: 'target/allure-results']]
                    ])
            }
            }
        }
    }
}
