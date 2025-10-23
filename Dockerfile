FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy gradle files
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY gradle.properties .

# Make gradlew executable
RUN chmod +x gradlew

# Copy source files
COPY src src

# Create entrypoint script
COPY entrypoint.sh .
RUN chmod +x entrypoint.sh

ENTRYPOINT ["/app/entrypoint.sh"]
