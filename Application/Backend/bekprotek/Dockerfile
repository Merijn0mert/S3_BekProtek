FROM openjdk:21-jdk-slim

WORKDIR /app

COPY /target/bekprotek-0.0.1-SNAPSHOT.jar /app/bekprotek-backend.jar

EXPOSE 8082

CMD ["java", "-jar", "/app/bekprotek-backend.jar"]
