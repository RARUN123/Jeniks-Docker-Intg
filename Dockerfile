From openjdk:17-alpine
EXPOSE 8081
ADD target/jenkins-docker-intg.jar jenkins-docker-intg.jar
ENTRYPOINT ["java","-jar" "/jenkins-docker-intg.jar"]
