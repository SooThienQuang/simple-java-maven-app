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
        stage('JaCoCo Coverage Report') {
            steps {
                // Xuất báo cáo bao phủ JaCoCo
                jacoco(execPattern: '**/target/*.exec', classPattern: '**/target/classes', sourcePattern: '**/src/main/java')
            }
        }
    }
    post {
        always {
            // Sau khi build, hiển thị báo cáo bao phủ
            junit '**/target/test-*.xml'
        }
    }
}
