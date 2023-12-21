# Social Media RESTful Web Services with Spring Boot
## Overview
This project provides a foundation for building RESTful web services for a social media platform using the Spring Boot framework. It includes basic functionalities for managing users, posts, and interactions.
## Prerequisites
-> Java Development Kit (JDK) 8 or later
-> Maven (for building and managing dependencies)
-> MySQL (or another relational database of your choice)
-> Your favorite Integrated Development Environment (IDE) with Spring Boot support

## Endpoints
The following endpoints are provided:

Users :<br>
GET /api/users: Get a list of all users.<br>
GET /api/users/{id}: Get information about a specific user.<br>
POST /api/users: Create a new user.<br>
PUT /api/users/{id}: Update information for a specific user.<br>
DELETE /api/users/{id}: Delete a user.<br>
Posts :<br>
GET /api/posts: Get a list of all posts.<br>
GET /api/posts/{id}: Get information about a specific post.<br>
POST /api/posts: Create a new post.<br>
PUT /api/posts/{id}: Update information for a specific post.<br>
DELETE /api/posts/{id}: Delete a post.<br>
Interactions :<br>
POST /api/interactions/like/{postId}: Add a like to a post.<br>
POST /api/interactions/comment/{postId}: Add a comment to a post<br>

## Technologies Used
Spring Boot ,
Spring Data JPA ,
MySQL ,
Maven.

