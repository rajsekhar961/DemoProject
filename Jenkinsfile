pipeline{
	
	agent any
	
	stages{
		
		
		stage('Build'){
			
			steps{
				bat 'mvn clean'
			}
		}
		
		stage('Test'){
			
			steps{
				bat 'mvn test'
			}
		}
		
		stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Pipeline ran successfully!'
        }
        failure {
            echo 'Pipeline failed.'
        }
	}
}