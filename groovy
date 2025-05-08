peline {
    agent any

    environment {
        IMAGE_NAME = 'hello-java'
        IMAGE_TAG = 'latest'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
                }
            }
        }

        stage('Run Java App in Container') {
            steps {
                script {
                    sh "docker run --rm ${IMAGE_NAME}:${IMAGE_TAG}"
                }
            }
        }
    }
}
