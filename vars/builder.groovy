#!/usr/bin/env groovy

def buildProject(Map args = [:]) {

  def jobName = JOB_NAME.split(/)[1]
  def repoName
  if (args.repoName) {
    repoName = args.repoName
  } else {
    repoName = jobName
  }

  try {
    stage('echo') {
      echo jobName
    }
  } catch (e) {
    currentBuild.result = 'FAILED'
  }

}

def test() {
  sh ('Check if this works')
}
return this;
