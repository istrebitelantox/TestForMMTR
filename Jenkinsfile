pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean verify -DskipITs=true';junit '**/target/surefire-reports/TEST-*.xml'archive 'target/*.jar'
            }
        }
    }
}
