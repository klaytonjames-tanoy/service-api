# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY target/service-api-0.0.1-SNAPSHOT.jar /app/service-api.jar

# Specify the command to run your application
CMD ["java", "-jar", "service-api.jar"]
