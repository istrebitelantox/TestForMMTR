pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/istrebitelantox/TestForMMTR.git'
                sh 'mvn clean test'
            }
            post{
                always{
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
