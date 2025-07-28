
# Spring Boot User Login and Registration System

This is a basic Spring Boot web application that supports user registration and login using:
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL

## 🚀 Features

- User registration (signup)
- User login
- Form validation and error handling
- Welcome page after login
- Secure password handling (extendable)
- MVC pattern (Controllers, Services, Repository, Models)

## 🛠 Technologies Used

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf (HTML templating)
- MySQL
- Maven

## 🗃️ Project Structure

```
src
├── main
│   ├── java
│   │   └── com.example.demo
│   │       ├── controller        # LoginController, SignupController, HomeController
│   │       ├── model             # User.java (entity class)
│   │       ├── repository        # UserRepository (JPA Interface)
│   │       ├── service           # UserService + UserServiceImpl
│   │       └── DemoApplication.java
│   └── resources
│       ├── templates             # login.html, signup.html, welcome.html, home.html
│       └── application.properties
```

## 📄 How to Run

### 1. Clone the project
```bash
git clone https://github.com/your-username/springboot-login-registration.git
cd springboot-login-registration
```

### 2. Configure MySQL database

Create a MySQL database, e.g., `springdb`, then update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/springdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.thymeleaf.cache=false
```

### 3. Build and Run

Use your IDE (like IntelliJ or VS Code), or use terminal:

```bash
mvn spring-boot:run
```

### 4. Open in browser

```
http://localhost:8080/login
http://localhost:8080/signup
```

## ✅ Default Pages

| URL             | Description          |
|------------------|----------------------|
| `/login`         | Login form           |
| `/signup`        | Signup form          |
| `/welcome`       | Welcome page         |
| `/home`          | Home (optional)      |

## 📝 To Do

- Add password encryption (e.g., BCrypt)
- Add session management / logout
- Add email confirmation (optional)

## 📄 License

This project is open-source and free to use for educational purposes.
