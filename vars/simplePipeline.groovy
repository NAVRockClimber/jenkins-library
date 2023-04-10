def call() {
    
    pipeline {
        agent kubernetes
        stages {
            stage("hello") {
                steps {
                    sh "echo hello world"
                }
            }

        }
    }
}