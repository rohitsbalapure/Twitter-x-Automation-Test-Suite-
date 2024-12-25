pipeline {
    agent any
    tools {
        jdk 'jdk-17'      
        maven 'maven'   
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/rohitsbalapure/Twitter-x-Automation-Test-Suite-.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml' // Publish test results
        }
    }
}
