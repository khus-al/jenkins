pipeline {
    agent any 
    parameters {
        string (name: 'myParameter', defaultValue: 'myVal', description: 'Enter parameter value')
    }
    stages {
        stage('build') {
            steps {
                echo 'Building'
                echo 'Running ${env.BUILD_ID} on ${env.JENKINS_URL}'

            }
        }
        stage('test') {
            steps {
                echo 'testing..'
                echo "${params.myParameter} is value retrieved!"
        
            }
        }
        stage('Deploy') {
            steps {
                echo 'deploying..'
            }
        }
    }
}