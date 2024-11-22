pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    // Chạy Maven để build dự án
                    sh 'mvn clean install'
                }
            }
        }
       
    }
}
