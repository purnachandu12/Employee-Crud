A Spring Boot-based Event Management REST API that allows users to create, update, delete, and fetch events.
This project is designed to help students and organizers manage college or community events effectively.

Features:
1)Add new events with details (name, location, date, description).
2) Retrieve all events or a specific event by ID.
3) Update existing events.
4) Delete events when no longer needed.
5) Get all past events (before today’s date).

Tech Stack:
Backend: Spring Boot
Database: MySQL
Tools: Maven, Postman, Git

Api EndPoints:
GET     /api/events           → Get all events  
POST    /api/events           → Add a new event  
GET     /api/events/{id}      → Get event by ID  
PUT     /api/events/{id}      → Update an event by ID  
DELETE  /api/events/{id}      → Delete an event by ID  
GET     /api/events/past      → Get all past events  

