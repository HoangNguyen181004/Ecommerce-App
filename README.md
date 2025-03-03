# Simple E-commerce App

SimpleEcommerceApp is a web-based application built with Spring Boot and MySQL that provides essential e-commerce functionalities, including user registration, login, product listing, and an admin panel for managing the store.

## Features

- **User Authentication:** Sign up and login functionality for users and admins.
- **Role-Based Access:** 
  - Users can browse and purchase products.
  - Admins can manage products and orders.
- **Product Management:** Add, update, and delete products.
- **Order Processing:** Users can place orders, and admins can manage them.
- **Responsive UI:** Built with Bootstrap for a modern look.

## Technologies Used

- **Backend:** Java, Spring Boot
- **Frontend:** Thymeleaf, HTML, CSS, Bootstrap
- **Database:** MySQL
- **Tools & Version Control:** Git, GitHub

## Setup Instructions

### Prerequisites
- Java 17 or later
- MySQL Server
- Maven
- Git

### Installation Steps

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/simpleecommerceapp.git
   cd simpleecommerceapp
   ```

2. **Configure Database:**
   - Open `src/main/resources/application.properties` and update the MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     ```
   - Ensure MySQL is running and create the database manually:
     ```sql
     CREATE DATABASE ecommerce_db;
     ```

3. **Build and Run the Application:**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application:**
   - Open your browser and visit: `http://localhost:8080`

## Usage

- **Homepage:** Accessible without login.
- **Login:** Users and admins can log in using their credentials.
- **Admin Panel:** Accessible after admin login to manage products and orders.
- **Shopping:** Users can browse products and place orders.
