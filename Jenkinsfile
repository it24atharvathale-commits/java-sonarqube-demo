
pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {
        stage('Get Source Code') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean verify'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:5.0.0.4389:sonar'
                }
            }
        }
    }

    post {
        success {
            echo 'Build and SonarQube analysis completed successfully.'
        }
        failure {
            echo 'Build failed. Check Console Output.'
        }
    }
}
