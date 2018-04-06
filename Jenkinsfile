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
            sleep 40
          }
        }
      }
    }
    stage('Build') {
      input {
                message "Should we continue?"
                ok "Yes, we should."
                submitter "alice,bob"
                parameters {
                    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
                }
            }
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
