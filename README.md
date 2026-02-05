# Item REST API - Spring Boot Assignment

This project is a RESTful API built using Java and Spring Boot to manage a collection of items.
The application is deployed live on Render and accessible over HTTPS.

# Live Application URL
Base URL:
https://companyassignment-1.onrender.com

## Features

- Add a new item
- Get item by ID
- Input validation using annotations
- In-memory data storage using ArrayList
- Clean layered architecture (Controller, Service, Model)

## Technologies Used

- Java 17
- Spring Boot
- Maven
- Validation API

## How to Run the Application

1. Clone the repository
2. Run the following command:

mvn spring-boot:run

The server will start at:
http://localhost:8080

## API Endpoints

# Add Item =>

POST /items

Example:

URL:: https://companyassignment-1.onrender.com/items

Sample JSON:
{
  "name": "iPhone 15",
  “companyName”: ”Apple”,
  "description": "Apple smartphone",
  "price": 80000
}

# Get Item by ID =>

GET /items/{id}

Example:

URL:: https://companyassignment-1.onrender.com/items/1

## Notes

- This project uses in-memory storage (ArrayList), so data will reset when the server restarts.
