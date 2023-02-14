pipeline {
    environment {
        JAVA_TOOL_OPTIONS = "-Duser.home=/home/jenkins"
    }
    agent {
        dockerfile {
            label "docker"
            args "-v /tmp/maven:/home/jenkins/.m2 -e MAVEN_CONFIG=/home/jenkins/.m2"
        }
    }

    stages {
        stage("Build") {
            steps {
                sh "yum install openssh-clients"
                sh "ssh -V"
                sh "mvn -version"
                sh "mvn clean install"
                sh 'mvn clean verify -DskipITs=true';junit '**/target/surefire-reports/TEST-*.xml'archive 'target/*.jar'
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}