# 📚 Student Management API

A simple and efficient **Student Management REST API** built using **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **MySQL**. This project demonstrates CRUD (Create, Read, Update, Delete) operations for managing student records.

---

## 🚀 Features

- ➕ Add a New Student
- 📄 View All Students
- 🔍 Get Student Details by ID
- ✏️ Update Student Information
- ❌ Delete a Student
- 💾 MySQL Database Integration
- 🌐 RESTful API Architecture
- ⚡ Built with Spring Boot

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Eclipse IDE
- Postman

---

## 📁 Project Structure

```text
Student_Management_Api_Project
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── student.management.api
│   │   │       ├── controller
│   │   │       ├── entity
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       └── StudentManagementApiProjectApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
├── pom.xml
└── README.md
```

---

## 🗄️ Database Configuration

Update the **application.properties** file with your MySQL configuration.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=your_MySqlusername
spring.datasource.password=your_MySqlpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Running the Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Nikhil23108/Student_Management_Api_Project.git
```

### 2️⃣ Navigate to the Project

```bash
cd Student_Management_Api_Project
```

### 3️⃣ Create the Database

```sql
CREATE DATABASE studentdb;
```

### 4️⃣ Configure Database Credentials

Update the `application.properties` file with your MySQL username and password.

### 5️⃣ Run the Application

Run the main class:

```
StudentManagementApiProjectApplication.java
```

The application will start on:

```
http://localhost:8070
```

---

## 📬 REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/api/students` | Add Student |
| GET | `/api/students` | Get All Students |
| GET | `/api/students/{id}` | Get Student by ID |
| PUT | `/api/students/{id}` | Update Student |
| DELETE | `/api/students/{id}` | Delete Student |

---

## 📷 Sample Request Body

```json
{
  "name": "Nikhil",
  "course": "DAC",
  "marks": 90
}
```

---

## 🧪 API Testing

You can test all REST endpoints using:

- Postman
- Talend API Tester
- Thunder Client (VS Code)

---

## 📌 Future Enhancements

- ✅ Input Validation
- ✅ Global Exception Handling
- ✅ Swagger / OpenAPI Documentation
- ✅ Spring Security with JWT Authentication
- ✅ Pagination & Sorting
- ✅ Docker Support
- ✅ Unit & Integration Testing

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a feature branch

```bash
git checkout -b feature-name
```

3. Commit your changes

```bash
git commit -m "Add new feature"
```

4. Push to the branch

```bash
git push origin feature-name
```

5. Open a Pull Request

---

## 📸 Screenshots

### ➕ Add Student (POST)
<img width="1066" height="551" alt="sm_Post" src="https://github.com/user-attachments/assets/2f2d973f-1755-40d8-a177-07819a7651c2" />


### 📄 Get All Students (GET)
<img width="1104" height="567" alt="sm_Get" src="https://github.com/user-attachments/assets/b822bfca-703b-42a0-89f8-bbfe485c1bd2" />

### ✏️ Update Student (PUT)
<img width="1087" height="560" alt="sm_Put" src="https://github.com/user-attachments/assets/4a80c1da-ac04-4566-a91d-8ee6b80b13cd" />


### ❌ Delete Student (DELETE)
<img width="1057" height="580" alt="sm_Delete" src="https://github.com/user-attachments/assets/6a2f7494-ffd2-48da-87d7-2214da234c31" />

### 🗄️ MySQL Database
<img width="1284" height="676" alt="sm_mysql" src="https://github.com/user-attachments/assets/06884463-8e94-4d3d-80cb-39ea0b649201" />

## 👨‍💻 Author

**Nikhil Landge**

Java Developer | Spring Boot Enthusiast

---

## ⭐ Support

If you found this project helpful, please consider giving it a ⭐ on GitHub.
