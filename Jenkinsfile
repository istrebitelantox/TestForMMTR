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
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'docker run -p 8081:8081 -p 50000:50000 maven'
                sh 'mvn test'
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
