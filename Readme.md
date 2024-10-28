# Spring Boot: JWT Authentication Project

This project demonstrates how to implement a JWT Authentication functionality in a Spring Boot application.

## Overview

This project showcases the implementation of a JWT Authentication feature in a Spring Boot application.

Technologies used:
- Spring Boot 3
- Spring Security 6
- jsonwebtoken

## Installation

Follow these steps to install and run the project:

1. Clone the repository: `git clone https://github.com/aleWidom/portfolio-springboot-authentication-jwt`
2. Navigate to the project directory: `cd your-repo`
3. Build the project using Maven: `mvn clean install`
4. Run the project: `mvn spring-boot:run`
5. Test the API Rest using Postman or another application at `http://localhost:8080`.

## Swagger Documentation

This project includes Swagger for API documentation. You can access the API documentation by navigating to `http://localhost:8080/swagger-ui/index.html` in your web browser.

### Note:
Make sure to authenticate using the `/auth/login` endpoint to obtain a JWT token before trying the other API endpoints listed in the Swagger UI.

## Authentication
To access the endpoints of this API, you need to authenticate and obtain a JWT token. Follow these steps:

### 1-Login:

a) Make a POST request to /auth/login with the following JSON body

{
"username": "your_username",
"password": "your_password"
}

b) You will receive a JWT token in the response.

### 2-Using the token in Swagger::

a) When you access Swagger at http://localhost:8080/swagger-ui/index.html, you can enter the JWT token in the authentication section.

b) Click on the "Authorize" button, enter the token in the provided field, and click "Authorize".

### Note:
Ensure that the token is included in requests to endpoints that require authentication.# portfolio-springboot-authentication-jwt
