# Inventory & Order Management System

A backend REST API application developed using **Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL** to manage products, inventory, and customer orders.

The application follows a layered architecture consisting of Controller, Service, and Repository layers to maintain clean code separation and simplify application maintenance.

## 🚀 Technologies Used

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate ORM
* MySQL
* Maven
* Postman

## 📌 Features

### Product Management

* Add new products
* Retrieve all products
* Retrieve product by ID
* Update existing product details
* Delete products
* Search and filter products

### Inventory Management

* Manage product stock quantities
* Check product availability
* Identify low-stock products
* Prevent invalid stock operations

### Order Management

* Place customer orders
* Calculate order totals
* Validate product availability
* Update order status
* Cancel eligible orders

## 🏗️ Project Architecture

```text
src/main/java/com/inventory/
│
├── controller/
│   ├── ProductController.java
│   ├── InventoryController.java
│   └── OrderController.java
│
├── service/
│   ├── ProductService.java
│   ├── InventoryService.java
│   └── OrderService.java
│
├── repository/
│   ├── ProductRepository.java
│   ├── InventoryRepository.java
│   └── OrderRepository.java
│
├── model/
│   ├── Product.java
│   ├── Inventory.java
│   └── Order.java
│
└── InventoryManagementApplication.java
```

## 🔗 REST API Endpoints

### Product APIs

| Method | Endpoint        | Description            |
| ------ | --------------- | ---------------------- |
| POST   | `/save`         | Add a new product      |
| GET    | `/getAll`       | Retrieve all products  |
| GET    | `/getById/{id}` | Retrieve product by ID |
| PUT    | `/update/{id}`  | Update product details |
| DELETE | `/delete/{id}`  | Delete a product       |

*Note: Update the endpoint paths above to match your actual controller mappings.*

## 📥 Sample Product JSON

```json
{
  "name": "Nike Air Max Running Shoes",
  "description": "Lightweight running shoes with cushioned sole",
  "category": "Footwear",
  "brand": "Nike",
  "price": 5999.00,
  "quantity": 40
}
```

## ⚙️ Configuration

Configure your MySQL database in `src/main/resources/application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Replace `your_password` with your local MySQL password.

## ▶️ How to Run

1. Clone the repository.

```bash
git clone https://github.com/your-username/Inventory-Management-System.git
```

2. Open the project in Eclipse or IntelliJ IDEA.

3. Create the MySQL database.

```sql
CREATE DATABASE inventory_db;
```

4. Configure the database credentials in `application.properties`.

5. Run the Spring Boot application.

6. Test the REST APIs using Postman.

## 🧪 API Testing

All REST endpoints can be tested using Postman by sending HTTP requests with JSON request bodies.

## 📚 Concepts Practiced

* RESTful API development
* Spring Boot layered architecture
* Dependency Injection
* Service and Repository interfaces
* Spring Data JPA and Hibernate
* MySQL database integration
* CRUD operations
* Exception handling
* HTTP methods and status codes

## 👨‍💻 Author

**Janhvi Kale**

Java | Spring Boot | Hibernate | MySQL | REST APIs

---

*This project is developed for learning and demonstrating backend application development using Java and Spring Boot.*
