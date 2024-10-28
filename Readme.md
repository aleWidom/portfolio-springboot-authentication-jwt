# Spring Boot: JWT Authentication Project

This project demonstrates how to implement a JWT Authentication functionality in a Spring Boot application.

## Overview

This project showcases the implementation of a JWT Authentication feature in a Spring Boot application.

Technologies used:
- Spring Boot 3
- Spring Security 6
- jsonwebtoken
- MySQL

## Installation

Follow these steps to install and run the project:

1. Clone the repository: `git clone <your-repo-url>`
2. Navigate to the project directory: `cd your-repo`
3. Build the project using Maven: `mvn clean install`
4. Run the project: `mvn spring-boot:run`
5. Test the API Rest using Postman or another application at `http://localhost:8080`.

## Swagger Documentation

This project includes Swagger for API documentation. You can access the API documentation by navigating to `http://localhost:8080/swagger-ui/index.html` in your web browser.

## Authentication and Registration

Before accessing the protected API endpoints, you need to follow these steps:

1. **Register a new user**:
   Use the `/auth/register` endpoint to create a new user in the system. You can send a POST request with the required user details (e.g., username, password) to register.

2. **Login and get a JWT token**:
   After registration, use the `/auth/login` endpoint to authenticate with the username and password. Upon successful authentication, you'll receive a JWT token.

3. **Use the JWT token**:
   To access protected endpoints, include the JWT token in the `Authorization` header as a Bearer token:
   
