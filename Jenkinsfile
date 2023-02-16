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
            image 'maven'
        }
    }
    stages {
        stage('Build') {
            steps {
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
