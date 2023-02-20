pipeline {
    agent {
        dockerfile true
    }
    stages {
        stage('Build') {
            steps {
                echo 'Load'
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
