pipeline {
  agent any
  stages {
    stage('setup') {
      parallel {
        stage('setup') {
          steps {
            echo 'Setup du job'
          }
        }
        stage('') {
          steps {
            sleep 3
          }
        }
      }
    }
    stage('') {
      steps {
        echo 'en cours'
      }
    }
  }
  environment {
    ENV1 = 'formation'
  }
}