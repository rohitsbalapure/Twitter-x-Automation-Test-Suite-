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
        stage('Check Environment') {
            steps {
                script {
                    sh 'echo $JAVA_HOME'
                    sh 'echo $MAVEN_HOME'
                    sh 'java -version'
                    sh 'mvn -v'
                }
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}
