pipeline {
  agent any
  parameters{
    string(name: 'JDK_HOME', defaultValue:'Java8', description:'Version du JDK ?')
  }
  tools { 
        maven 'M3' 
        jdk '${params.JDK_HOME}' 
    }
  stages {
    stage('Preparation') {
      parallel {
        stage('Preparation') {
          steps {
            sh 'mvn -Dmaven.test.failure.ignore clean site:site'
          }
        }
        stage('Dodo') {
          steps {
            sleep 40
          }
        }
      }
    }
    stage('Build') {
      steps {
        echo 'Construction'
      }
    }
    stage('Resultat') {
      steps {
        echo 'Fini le pippeline !!'
      }
    }
  }
}
