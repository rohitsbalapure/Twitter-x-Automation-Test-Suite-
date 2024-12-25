pipeline {
    agent any
    tools {
        jdk 'jdk-17'      
        maven 'maven'   // Replace with the Maven configured in Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/rohitsbalapure/Twitter-x-Automation-Test-Suite-.git'
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
