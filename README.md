# kotlin-dropwizard

A simple Kotlin Dropwizard microservice with a hello world GET API.

## Features

- Minimal Kotlin Dropwizard application
- Hello World REST endpoint at `/hello`
- Returns JSON response: `{"message": "Hello, World!"}`

## Build and Run

1. Build the application:
```bash
mvn clean package
```

2. Run the application:
```bash
java -jar target/kotlin-dropwizard-1.0.0.jar server config.yml
```

3. Test the API:
```bash
curl http://localhost:8080/hello
```

Expected response:
```json
{"message": "Hello, World!"}
```

## Endpoints

- **Application**: http://localhost:8080
- **Admin**: http://localhost:8081
- **Hello API**: http://localhost:8080/hello

## Project Structure

- `src/main/kotlin/com/example/HelloWorldApplication.kt` - Main application class
- `src/main/kotlin/com/example/HelloWorldResource.kt` - REST resource with GET endpoint
- `src/main/kotlin/com/example/HelloWorldConfiguration.kt` - Configuration class
- `config.yml` - Application configuration
- `pom.xml` - Maven build configuration