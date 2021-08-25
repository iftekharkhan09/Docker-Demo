FROM openjdk:16-jdk-slim-buster

# The application's jar file
ARG JAR_FILE=./target/docker-demo-1.0.0.jar

# Add the application's jar to the container
ADD ${JAR_FILE} docker-demo-1.0.0.jar

EXPOSE 8080
ENV PORT 8080

# Run the jar file
ENTRYPOINT ["java", "-jar","/docker-demo-1.0.0.jar"]

# K8S deployment contains the necessary startup command
CMD []