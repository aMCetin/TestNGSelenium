pipeline {
    agent any
        stage ('Compile Stage') {

            steps {
                withMaven(maven : ' '){
                     sh 'mvn clean compile'
            }
        }
    }
        stage ('Testing Stage') {

            steps {
                withMaven(maven : ' '){
                    sh 'mvn clean compile'
            }
        }
    }
        stage ('Deployment Stage') {

             steps {
                    withMaven(maven : '3.6.3 '){
                        sh 'mvn clean compile'
                    }
             }
        }
    }
}