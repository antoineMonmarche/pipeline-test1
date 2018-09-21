pipeline{
  agent any
  libraries{
  lib('pipeline-test1@master')
  }
  stages{
    stage('Step1'){
      steps{
        call('Antoine')
      }
    }
  }
}
