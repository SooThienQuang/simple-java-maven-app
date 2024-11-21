pipeline {
    agent any
    environment {
        // Cấu hình môi trường cho SonarQube
        SONARQUBE = 'SonarQube Server'
    }
    stages {
        stage('Build') {
            steps {
                script {
                    // Build dự án với Maven (hoặc Gradle)
                    sh 'mvn clean install'
                }
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {
                    // Thực hiện phân tích SonarQube
                    withSonarQubeEnv(SONARQUBE) {
                        sh 'mvn sonar:sonar'
                    }
                }
            }
        }
    }
    post {
        always {
            // Sau khi phân tích, kiểm tra kết quả và hiển thị báo cáo
            waitForQualityGate()
        }
    }
}
