node {
	stage ('SCM checkout'){
		git "https://github.com/dhiralpat/cars.git"
		}
	stage ('Build'){
    	dir("comtest") {
	   sh "mvn clean install"
       }
       	dir("comtest/target") {
	   sh "java -jar  cars.com 1.0-SNAPSHOT.jar"
       }
		}
}
