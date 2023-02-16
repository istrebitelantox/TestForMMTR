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
                sh 'docker run -it --rm --name my-maven-project -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3.3-jdk-8 mvn clean install'
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
