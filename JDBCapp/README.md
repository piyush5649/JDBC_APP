# JDBC Employee Management System
A simple Java application using JDBC to manage employee records in a MySQL database.

## Table of Contents
- [Features](#features)
- [Technologies](#technologies)
- [Setup](#setup)
- [How to Run](#how-to-run)
- [Required Libraries](#required-libraries)
- [Testing](#testing)
- [Project Structure](#project-structure)
- [Author](#author)

## Features
- Add a new employee
- Delete an employee by ID
- Replace (insert or update) employee data
- Fetch and display all employees

## Technologies
- Java
- JDBC API
- MySQL
- JUnit 5
- Eclipse IDE
- Git & GitHub

## Setup
1. Clone the repo or download the ZIP.
2. Import the project into Eclipse.
3. Set up your MySQL database.
4. Update `DBconnection.java` with your DB credentials.

## Required Libraries
- MySQL Connector JAR
- JUnit 5 Library (add via Eclipse build path)

## How to Run
- Run `UseApp.java` for manual operations.
- Use `EmployeeDOATest.java` for JUnit 5 testing.

## Project Structure
src/
└── com/sp/jdbcapp/
    ├── DBconnection.java
    ├── Employee.java
    ├── EmployeeDAO.java
    ├── UseApp.java
    └── EmployeeDOATest.java

## Testing
- JUnit 5 tests included in `EmployeeDOATest.java`.
- Covers add, delete, replace, and fetch operations.
    
## Author
Piyush Sarvaiya  
📧 piyushsarvaiya56499@gmail.com  
🌐 [GitHub Profile](https://github.com/piyush5649)
    
    
---

Let me know if you'd like to include Git commands or screenshots as well — I can help you format those too.
    