pipeline{
  agent any
  libraries{
  	lib('lib-demo1@master')
  }
  stages{
    stage('Step1'){
      steps{
        hello 'Antoine'
      }
    }
  }
}
