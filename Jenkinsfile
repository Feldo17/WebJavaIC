pipeline {
  agent any
  stages {
    stage('Preparation') {
      parallel {
        stage('Preparation') {
          steps {
            sh 'mvn -Dmaven.test.failure.ignore clean site:site'
          }
        }
        stage('') {
          steps {
            sleep 5
          }
        }
      }
    }
    stage('R�sultat') {
      steps {
        echo 'Fini le pippeline !!'
      }
    }
  }
}