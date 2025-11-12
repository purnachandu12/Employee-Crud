# Event Management Web Application

A **Spring Boot-based Event Management REST API** that allows users to create, update, delete, and fetch events easily.
This project is designed to help students and organizers manage **college or community events** efficiently through a structured and secure backend system.

---

## Features

Add new events with details (name, location, date, description)
Retrieve all events or a specific event by ID
Update existing events
Delete events when no longer needed
Fetch all past events (before today’s date)
Secure **user authentication using JWT (JSON Web Token)**

---

##  Tech Stack

| Layer        | Technology                       |
| ------------ | -------------------------------- |
| **Backend**  | Spring Boot                      |
| **Database** | MySQL                            |
| **Frontend** | HTML, CSS, JavaScript, Bootstrap |
| **Security** | JWT Authentication               |
| **Tools**    | Maven, Postman, Git              |

---

##  API Endpoints

| Method     | Endpoint           | Description           |
| ---------- | ------------------ | --------------------- |
| **GET**    | `/api/events`      | Get all events        |
| **POST**   | `/api/events`      | Add a new event       |
| **GET**    | `/api/events/{id}` | Get event by ID       |
| **PUT**    | `/api/events/{id}` | Update an event by ID |
| **DELETE** | `/api/events/{id}` | Delete an event by ID |
| **GET**    | `/api/events/past` | Get all past events   |

---

## Authentication Endpoints (JWT)

| Method   | Endpoint             | Description                   |
| -------- | -------------------- | ----------------------------- |
| **POST** | `/api/auth/register` | Register a new user           |
| **POST** | `/api/auth/login`    | Login and receive JWT token   |
| **GET**  | `/api/auth/profile`  | Access user profile (secured) |

---

##  Database Schema (Example)

**Table Name:** `events`

| Column        | Type                              | Description       |
| ------------- | --------------------------------- | ----------------- |
| `id`          | INT (Primary Key, Auto Increment) | Unique event ID   |
| `name`        | VARCHAR(255)                      | Event name        |
| `location`    | VARCHAR(255)                      | Event location    |
| `date`        | DATE                              | Event date        |
| `description` | TEXT                              | Event description |

**Table Name:** `users`

| Column     | Type                              | Description                   |
| ---------- | --------------------------------- | ----------------------------- |
| `id`       | INT (Primary Key, Auto Increment) | User ID                       |
| `username` | VARCHAR(255)                      | Unique username               |
| `password` | VARCHAR(255)                      | Encrypted password            |
| `role`     | VARCHAR(50)                       | User role (e.g., ADMIN, USER) |

---

## How to Run the Project

### Backend Setup (Spring Boot)

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/event-management-api.git
   cd event-management-api
   ```

2. Configure **MySQL** in `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/event_management
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   jwt.secret=your-secret-key
   ```

3. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

4. Test endpoints using **Postman**.

---

### Frontend Setup

1. Open the `frontend` folder.
2. Launch `index.html` in a browser.
3. Use forms to add, view, or delete events.
4. JWT token can be stored in `localStorage` for authentication-based requests.

---

## 📈 Future Enhancements

* ✅ Role-based access (Admin/User)
* ✅ Event reminders/notifications
* ✅ Pagination and sorting
* ✅ Integration with Google Calendar API
* ✅ Enhanced dashboard analytics

---

## 🤝 Contributing

Contributions are welcome!

1. Fork this repository
2. Create a new feature branch
3. Commit your changes
4. Open a Pull Request

---
