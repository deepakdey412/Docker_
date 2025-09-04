# Step 1: Use base image with Java 21
FROM openjdk:21

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy JAR file into container
# Make sure this matches the actual JAR name in target/
COPY target/docker-demo.jar docker-demo.jar

# Step 4: Expose port 8080
EXPOSE 8080

# Step 5: Run the app
ENTRYPOINT ["java", "-jar", "docker-demo.jar"]
