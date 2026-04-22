@Library('my-shared-lib@main') _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                buildApp()
            }
        }

        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                deployApp()
            }
        }
    }
}
