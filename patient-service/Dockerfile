# Use official OpenJDK base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the .jar file created by Maven into the container
COPY target/patient-service-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the service will run on
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
