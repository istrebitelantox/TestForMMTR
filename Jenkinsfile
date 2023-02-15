
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
node {
allure([
         includeProperties: false,
         jdk: '',
         properties: [[key: 'allure.issues.tracker.pattern', value: 'http://tracker.company.com/%s']],
         reportBuildPolicy: 'ALWAYS',
         results: [[path: 'target/allure-results'], [path: 'other_target/allure-results']]
         ])
}