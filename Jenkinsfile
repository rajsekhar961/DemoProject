pipeline{
	
	agent any
	
	stages{
		
		stage('Checkout'){
			
			steps{
				git 'https://github.com/rajsekhar961/DemoProject.git'
			}
		}
		
		stage('Build'){
			
			steps{
				sh 'mvn clean compile'
			}
		}
		
		stage('Test'){
			
			steps{
				sh 'mvn test'
			}
		}
		
		stage('Package') {
            steps {
                sh 'mvn package'
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