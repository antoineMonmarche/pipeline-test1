pipeline{
  agent any
  stages{
    stage('Step1'){
      steps{
        echo 'Hello World'
      }
    }
  }
}