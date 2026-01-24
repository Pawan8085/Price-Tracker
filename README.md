# Price Tracker

A **secure full-stack Price Tracker application** that allows users to track product prices from e-commerce websites and get notified when prices drop.

---

## 🚀 Features
- User **Sign Up & Sign In**
- Add products for price tracking
- View all tracked products
- View **price-dropped products**
- Email notification on price drop
- Secure authentication using JWT

---

## 🛠️ Tech Stack

### Backend
- Spring Boot
- Spring Security
- JWT Authentication
- Hibernate (JPA)
- MySQL
- Java Mail

### Frontend
- HTML
- CSS
- JavaScript

### Security
- JWT Authentication


### Scheduling
- Spring Scheduler for automated price checks

---

## 📂 Project Structure



  ## 📂 **Project Structure**
```
PriceTracker
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── app
│       │           ├── config               # Configuration package
│       │           ├── controller           # REST controllers package
│       │           ├── dtos                 # Data Transfer Objects package
│       │           ├── exceptions           # Custom exceptions package
│       │           ├── model                # JPA entities package
│       │           ├── repository           # Repositories package
│       │           ├── services             # Service layer package
│       └── resources
│           └── application.properties       # Application configuration
├── src
│   └── test                                 # Test package
└── pom.xml                                  # Maven build configuration
```

---

## 🔗 API Endpoints

### User Sign-Up
- **URL:** `/user/register`
- **Method:** `POST`
- **Description:** Creates a new user account

---

### User Sign-In
- **URL:** `/signIn`
- **Method:** `POST`
- **Description:** Authenticates user credentials and returns JWT

---

### Add Product
- **URL:** `/product/add`
- **Method:** `POST`
- **Description:** Adds a new product for price tracking

---

### Delete Product
- **URL:** `/product/{productId}`
- **Method:** `DELETE`
- **Description:** Deletes a tracked product belonging to the authenticated user

---

### Get All Products
- **URL:** `/product/all`
- **Method:** `GET`
- **Description:** Retrieves all products tracked by the logged-in user

---

### Get Price-Dropped Products
- **URL:** `/product/pricedrop`
- **Method:** `GET`
- **Description:** Retrieves products whose prices have dropped

---

## 🔐 Security Notes
- All product APIs are **secured using JWT**
- User ownership is validated before modifying or deleting products
- Unauthorized access returns appropriate HTTP status codes

---

## 📧 Email Notifications
- Users receive email alerts when a tracked product’s price drops
- Implemented using **Spring Scheduler** and **Java Mail**

---


