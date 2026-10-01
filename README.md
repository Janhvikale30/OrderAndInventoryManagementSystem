# Inventory & Order Management System

A collaborative backend application developed using **Java, Spring Boot, Spring Data JPA, Hibernate, MySQL, and Python** to manage products, inventory, customer orders, stock alerts, and inventory analytics.

The project follows a layered architecture consisting of **Controller, Service, and Repository** layers to maintain clean code separation and simplify application maintenance.

The team is divided into Java backend development and Python analytics modules. The Java backend manages core business operations and database communication, while Python modules provide low-stock alerts and inventory/sales reports.

## 🚀 Technologies Used

### Java Backend

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate ORM
* MySQL
* Maven
* Postman

### Python Modules

* Python 3
* Requests
* CSV (Python Standard Library)
* Pandas (optional, for data analysis and reports)

### Development Tools

* Eclipse IDE / IntelliJ IDEA
* VS Code
* Git
* GitHub
* Postman
* MySQL Workbench

## 📌 Project Features

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

### Python Inventory Analytics & Alert System

* Identify products with low stock
* Generate inventory summary reports
* Analyze product quantities and stock levels
* Generate basic sales reports using order data
* Export reports to CSV format
* Retrieve data from Java REST APIs or process exported CSV files

## 👥 Team Contributions

### Java Developers — Core Backend

Java developers are responsible for:

* Developing Product, Inventory, and Order REST APIs
* Implementing business logic using the Service layer
* Connecting the application with MySQL using Spring Data JPA and Hibernate
* Validating product availability and stock operations
* Managing order placement, totals, and status updates
* Testing APIs using Postman

### Python Developer 1 — Low Stock Alert System

Responsibilities:

* Retrieve product/inventory data from the Java REST API or CSV files
* Identify products whose quantity is below a defined threshold
* Display low-stock product details
* Generate a low-stock report

Example:
If the minimum stock threshold is 10, products with quantity below 10 are reported as low-stock products.

### Python Developer 2 — Inventory & Sales Analytics

Responsibilities:

* Read product and order data from Java REST APIs or CSV files
* Generate inventory summary reports
* Calculate basic sales summaries from available order data
* Export reports into CSV format
* Provide readable summaries for the team

**Note:** Python modules are reporting and analytics components. The Java backend remains responsible for core product, inventory, and order transactions.

## 🏗️ Project Architecture

```text
Inventory-Order-Management-System/
│
├── java-backend/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/inventory/
│   │       │   ├── controller/
│   │       │   │   ├── ProductController.java
│   │       │   │   ├── InventoryController.java
│   │       │   │   └── OrderController.java
│   │       │   │
│   │       │   ├── service/
│   │       │   │   ├── ProductService.java
│   │       │   │   ├── InventoryService.java
│   │       │   │   └── OrderService.java
│   │       │   │
│   │       │   ├── repository/
│   │       │   │   ├── ProductRepository.java
│   │       │   │   ├── InventoryRepository.java
│   │       │   │   └── OrderRepository.java
│   │       │   │
│   │       │   ├── model/
│   │       │   │   ├── Product.java
│   │       │   │   ├── Inventory.java
│   │       │   │   └── Order.java
│   │       │   │
│   │       │   └── InventoryManagementApplication.java
│   │       │
│   │       └── resources/
│   │           └── application.properties
│   │
│   └── pom.xml
│
├── python-services/
│   ├── inventory_alerts/
│   │   └── low_stock_alert.py
│   │
│   ├── inventory_analytics/
│   │   └── inventory_report.py
│   │
│   ├── sales_reports/
│   │   └── daily_sales_report.py
│   │
│   ├── data/
│   │   ├── products.csv
│   │   └── orders.csv
│   │
│   ├── requirements.txt
│   └── README.md
│
└── README.md
```

*The structure above is the proposed team repository structure. Update it as modules are implemented.*

## 🔗 REST API Endpoints

### Product APIs

| Method | Endpoint        | Description            |
| ------ | --------------- | ---------------------- |
| POST   | `/save`         | Add a new product      |
| GET    | `/getAll`       | Retrieve all products  |
| GET    | `/getById/{id}` | Retrieve product by ID |
| PUT    | `/update/{id}`  | Update product details |
| DELETE | `/delete/{id}`  | Delete a product       |

*Note: Update the endpoint paths above to match the actual controller mappings.*

### Python Integration

Python modules can access Java backend data through REST APIs.

Example:

```http
GET http://localhost:8080/getAll
```

The API returns product data in JSON format. Python modules can process this data to identify low-stock products and generate reports.

Alternatively, Java/backend team members can export selected data into CSV files for offline reporting.

**Important:** CSV files are snapshots. If database records change, the CSV must be exported again to contain updated data.

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

## 📦 Spring Boot Dependencies

The Java backend uses Maven to manage dependencies.

Common dependencies for this project:

| Dependency                        | Purpose                                             |
| --------------------------------- | --------------------------------------------------- |
| `spring-boot-starter-web`         | Build REST APIs and handle HTTP requests            |
| `spring-boot-starter-data-jpa`    | Database operations using JPA repositories          |
| `mysql-connector-j`               | Connect Spring Boot to MySQL                        |
| `spring-boot-starter-validation`  | Validate incoming request data                      |
| `spring-boot-starter-test`        | Unit and integration testing                        |
| `spring-boot-devtools` (optional) | Development-time restart support                    |
| `lombok` (optional)               | Reduce boilerplate code such as getters and setters |

Add the required dependencies to the `pom.xml` file. Use versions compatible with your Spring Boot version; Spring Boot dependency management can manage versions for supported starters and libraries.

## 🐍 Python Dependencies

Python modules can use:

| Package             | Purpose                                        |
| ------------------- | ---------------------------------------------- |
| `requests`          | Call Java REST APIs                            |
| `pandas` (optional) | Analyze data and create reports                |
| `csv`               | Read and write CSV files; included with Python |

Example `requirements.txt`:

```text
requests
pandas
```

Install the Python dependencies:

```bash
pip install -r requirements.txt
```

## ⚙️ Configuration

Configure your MySQL database in `java-backend/src/main/resources/application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Replace `your_password` with your local MySQL password.

Do not commit real database passwords or other secrets to GitHub. Use environment variables or a local configuration file excluded from version control for sensitive credentials.

## ▶️ How to Run

### Java Backend

1. Clone the repository.

```bash
git clone https://github.com/your-username/Inventory-Order-Management-System.git
```

2. Open the `java-backend` folder in Eclipse or IntelliJ IDEA.
3. Create the MySQL database.

```sql
CREATE DATABASE inventory_db;
```

4. Configure database credentials in `application.properties`.
5. Run the Spring Boot application.
6. Test the REST APIs using Postman.

### Python Modules

1. Open the `python-services` folder in VS Code.
2. Install the dependencies.

```bash
pip install -r requirements.txt
```

3. Ensure the Java backend is running if the Python module consumes REST APIs.
4. Run the required Python script.

```bash
python inventory_alerts/low_stock_alert.py
```

*The script path above is an example; use the actual filename and location in your repository.*

## 🧪 API Testing

Java REST endpoints can be tested using Postman by sending HTTP requests with JSON request bodies.

Python modules can be tested using sample CSV files or data returned by the Java REST APIs.

## 🔄 Git Collaboration Workflow

The project is maintained in a shared GitHub repository.

* All developers clone the same repository.
* Each developer works on a separate feature branch.
* Developers add, commit, and push their changes to their branches.
* Developers create Pull Requests for their completed work.
* The Lead Developer reviews and merges approved Pull Requests into the `main` branch.
* Team members pull the latest changes from `main` to keep their local projects updated.

## 📚 Concepts Practiced

### Java

* RESTful API development
* Spring Boot layered architecture
* Dependency Injection
* Service and Repository layers
* Spring Data JPA and Hibernate
* MySQL database integration
* CRUD operations
* Exception handling
* HTTP methods and status codes

### Python

* Python functions and loops
* Reading and writing CSV files
* Consuming REST APIs using Requests
* Filtering and processing data
* Inventory analytics
* Report generation

### Team Collaboration

* Git and GitHub
* Branching and Pull Requests
* Code review and merge workflow
* Java-Python integration through REST APIs and CSV data exchange

## 👨‍💻 Contributors

* Java Backend Developers
* Python Developers
* Lead Developer

## 📌 Project Purpose

This collaborative project is developed for learning and demonstrating backend application development, database integration, REST API communication, Python-based inventory analytics, and team collaboration using Git and GitHub.
