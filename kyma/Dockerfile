FROM openjdk:11-jre-slim-buster
WORKDIR /app
COPY /target/kyma-0.0.1-SNAPSHOT.jar /app/kyma.jar
EXPOSE 8080
ENTRYPOINT  ["java","-jar","kyma.jar"]