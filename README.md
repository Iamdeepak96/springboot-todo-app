# 📝 Spring Boot Todo App

A full-stack Todo Application built using **Spring Boot**, **Thymeleaf**, **MySQL**, and **Spring Data JPA**.

This project demonstrates the fundamentals of Java Full Stack Development, including backend development, database integration, MVC architecture, and server-side rendering.

---

## 🚀 Features

* Add new tasks
* View all tasks
* Delete tasks
* Mark tasks as completed
* Store tasks in MySQL database
* Responsive and clean UI
* MVC architecture using Spring Boot

---

## 🛠️ Tech Stack

### Backend

* Java 24
* Spring Boot 3
* Spring Data JPA
* Hibernate

### Frontend

* Thymeleaf
* HTML5
* CSS3

### Database

* MySQL

### Build Tool

* Maven

---

## 📂 Project Structure

src/main/java
├── controller
├── models
├── repository
├── service
└── TodoappApplication.java

src/main/resources
├── templates
│ └── index.html
└── application.properties

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/Iamdeepak96/springboot-todo-app.git
cd springboot-todo-app
```

### 2. Create MySQL Database

```sql
CREATE DATABASE todoapp;
```

### 3. Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todoapp
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

### 4. Run Application

```bash
mvn spring-boot:run
```

### 5. Open Browser

```text
http://localhost:8080
```

---

## 🎯 Learning Outcomes

This project helped me learn:

* Spring Boot fundamentals
* MVC Architecture
* CRUD Operations
* Spring Data JPA
* MySQL Integration
* Thymeleaf Templates
* Git & GitHub

---

## 🔮 Future Improvements

* User Authentication
* Task Categories
* Due Dates
* REST API Version
* Docker Deployment
* Dark Mode UI

---

## 👨‍💻 Author

Deepak

BCA Student | Java Developer | Spring Boot Enthusiast

GitHub: https://github.com/Iamdeepak96
