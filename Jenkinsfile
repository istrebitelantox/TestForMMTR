// node {
// allure([
//          includeProperties: false,
//          jdk: '',
//          properties: [[key: 'allure.issues.tracker.pattern', value: 'http://tracker.company.com/%s']],
//          reportBuildPolicy: 'ALWAYS',
//          results: [[path: 'target/allure-results'], [path: 'other_target/allure-results']]
//          ])
// }
pipeline {
    agent {
        docker{
            image 'maven:3.6.0'
        }
    }
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
