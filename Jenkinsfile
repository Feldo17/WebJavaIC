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
        sh 'echo "shell script"'
      }
    }
    stage('') {
      steps {
        junit 'unit.xml'
      }
    }
  }
  environment {
    ENV1 = 'formation Serge'
  }
}