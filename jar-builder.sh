mvn clean package -f ./api-gateway/pom.xml -Dmaven.test.skip=true
mvn clean package -f ./eureka-service/pom.xml -Dmaven.test.skip=true
mvn clean package -f ./use-service/pom.xml -Dmaven.test.skip=true
mvn clean package -f ./payment-service/pom.xml -Dmaven.test.skip=true
