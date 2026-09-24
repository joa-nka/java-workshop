# java-workshop

A small **Spring Boot REST API** created for a hands-on Java workshop.

The application simulates a simple **financial crime investigation**. Your task is to use the REST API to investigate suspicious transactions, follow the money trail, identify an account owner and create an investigation.

---

## Workshop Scenario

A number of transactions are available in the system.

A transaction can be considered suspicious if it meets one or more of these criteria:

* Amount is **€50,000 or more**
* Currency is **not EUR**
* The same account is involved in more than 3 transactions within a short period

Your goal is to investigate the suspicious activity and identify the account and its owner behind the relevant transaction.

---

## Technologies

* Java 21
* Spring Boot
* Spring Web
* Spring Validation
* Maven
* OpenAPI / Swagger UI
* JUnit
* Mockito

The application uses in-memory data structures instead of a real database.

---

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/joa-nka/java-workshop.git
cd java-workshop
```

### 2. Run the application

Using Maven Wrapper:

**Windows:**

```bash
mvnw.cmd spring-boot:run
```

**macOS / Linux:**

```bash
./mvnw spring-boot:run
```

Or run `JavaWorkshopApplication` directly from IntelliJ IDEA.

### 3. Open Swagger UI

Once the application is running, open:

http://localhost:8080/swagger-ui/index.html

Swagger UI allows you to explore and execute the available API endpoints.

---

## API

The application provides three main areas:

### Transactions

Use the endpoints to find and inspect transactions.

```text
GET /api/transactions
GET /api/transactions/{id}
```

### Accounts

Use the endpoints to investigate an account and identify its owner.

```text
GET /api/accounts/{id}
GET /api/accounts/{id}/owner
```

### Investigations

Use the endpoints to create, update and remove investigations.

```text
GET    /api/investigations
GET    /api/investigations/{id}
POST   /api/investigations
PUT    /api/investigations/{id}
DELETE /api/investigations/{id}
```

---

## Project Structure

```text
src/main/java/com/example/javaworkshop
│
├── controller
│   ├── AccountController
│   ├── InvestigationController
│   └── TransactionController
│
├── model
│   ├── Account
│   ├── Customer
│   ├── Investigation
│   └── Transaction
│
├── repository
│   ├── AccountRepository
│   ├── InvestigationRepository
│   └── TransactionRepository
│
└── service
    ├── AccountService
    ├── InvestigationService
    └── TransactionService
```

The application follows a simple layered structure:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
In-memory data
```

---

## Unit Testing

The project also contains unit tests for `InvestigationService`.

The tests use:

* **JUnit** for writing and running tests
* **Mockito** for mocking dependencies

Run all tests with:

```bash
mvnw.cmd test
```

---

## Workshop Goal

By the end of the workshop, you should be able to:

* Explore a REST API using Swagger UI
* Work with GET, POST, PUT and DELETE endpoints
* Follow data through a simple Controller → Service → Repository structure
* Implement a missing piece of application logic
* Understand the basic structure of a unit test
* Use Mockito to isolate a service from its dependencies
* Investigate and fix a failing unit test

Good luck with the investigation — **follow the money.**
