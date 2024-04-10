FROM openjdk:21-jdk-slim

WORKDIR /app

#RUN ./mvnw package

#ARG JAR_FILE=target/bekprotek-0.0.1-SNAPSHOT.jar

COPY /target/bekprotek-0.0.1-SNAPSHOT.jar /app/bekprotek-backend.jar

EXPOSE 8081

CMD ["java", "-jar", "/app/bekprotek-backend.jar"]
