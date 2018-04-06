pipeline {
  agent any
  parameters{
    string(name: 'JDK_HOME', defaultValue:'Java8', description:'Version du JDK ?')
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
            sleep 10
          }
        }
      }
    }
    stage('Build') {
      input {
                message "Should we deploy?"
                ok "Yes, we should."
                parameters {
                    string(name: 'ENVT', defaultValue: 'Test', description: 'on which envt ?')
                }
            }
      steps {
        echo 'Construction'
        echo 'Build sur ${ENVT}'
      }
    }
    stage('Resultat') {
      steps {
        echo 'Fini le pippeline !!'
      }
    }
  }
}
