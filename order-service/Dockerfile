# Stage 1: Build
FROM --platform=$BUILDPLATFORM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom.xml and download dependencies (cached layer)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source and build
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:17-jre
WORKDIR /app

# Generic naming so this file works for any service
COPY --from=build /app/target/*.jar app.jar

# We use 8080 as the internal container port for all. 
# You map them to 8081, 8082, etc., in docker-compose.
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
