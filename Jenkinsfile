pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building application'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing application'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy application'
            }
        }
    }
    post
    {
        always {
            emailext attachLog: true, body: 'summary', subject: 'Test report', to: 'uma.sangada@gmail.com'
        }
    }
}
