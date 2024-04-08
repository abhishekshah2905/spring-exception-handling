# Exception Handling in a RESTful Service

This Spring Boot application demonstrates how to handle exceptions and validate input using custom error messages.

## Overview
The application includes controllers for handling user requests, a custom exception class for data validation errors, and global exception handlers to return meaningful error responses.

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven
### Installation
1. Clone the repository:
```bash
  git clone https://github.com/abhishekshah2905/spring-exception-handling.git
```
2. Navigate to the project directory:
```bash
  cd spring-exception-handling
```
3. Build the project:
```bash
  mvn clean install
```
4. Run the application:
```bash
  mvn spring-boot:run
```
5. Access the application at http://localhost:5000

### Usage
- The UserController class includes a /users endpoint that creates a user and handles validation errors using a custom exception (DataException).
- The application uses internationalized error messages from the messages.properties file for validation errors.

### Customization
- Modify the messages.properties file to add or modify error messages for validation.
- Customize the logging settings in the application.properties file as needed.