# Stage 1: Build the JAR inside Docker
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the standalone pom.xml you just fixed
COPY pom.xml .
# Pre-download dependencies (this helps with caching)
RUN mvn dependency:go-offline -B

# Copy the source code and build the package
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the final lightweight image
FROM eclipse-temurin:17-jre
WORKDIR /app
# Copy the JAR from the 'build' stage
COPY --from=build /app/target/*.jar notification-service.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "notification-service.jar"]
