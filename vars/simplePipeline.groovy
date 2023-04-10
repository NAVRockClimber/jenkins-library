def call() {
    pipeline {
        agent {
            kubernetes {
                yaml '''
                    apiVersion: v1
                    kind: Pod
                    spec:
                      containers:
                      - name: bash
                        image: bash:latest
                        command:
                        - cat
                        tty: true
                    '''
            }
        }
        stages {
            stage('hello') {
                steps {
                    container('bash') {
                        sh 'echo hello world'
                    }
                }
            }
        }
    }
}
