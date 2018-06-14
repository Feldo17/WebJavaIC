pipeline {
  agent any
  tools {
    maven 'M3'
  }
  stages {
    stage('setup') {
      parallel {
        stage('setup') {
          steps {
            echo 'Setup du job'
          }
        }
        stage('Sleep1') {
          steps {
            sleep 3
          }
        }
      }
    }
    stage('Print1') {
      steps {
        echo 'en cours'
      }
    }
    stage('suiv1') {
      steps {
        sh 'mvn test'
      }
    }
    stage('error') {
      steps {
        junit '**/test-reports/*.xml'
      }
    }
  }
  environment {
    ENV1 = 'formation Serge'
  }
}
