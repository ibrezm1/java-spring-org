FROM adoptopenjdk:17-jre-hotspot

WORKDIR /app

# Copy the compiled Spring Boot JAR file into the container
COPY build/libs/spring-boot-0.0.1-SNAPSHOT.jar app.jar

# Copy the application properties file into the container
COPY src/main/resources/application.properties application.properties

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
