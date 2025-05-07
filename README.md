# BITS Assignment

A Spring Boot application for managing book data, built with Java and PostgreSQL.

## 🚀 Technologies Used

- Java
- Spring Boot 3.4.5
- Spring Data JPA
- PostgreSQL
- Maven
- Docker & Docker Compose
- JUnit 5 & Mockito for testing

## 📋 Prerequisites

- Java JDK 17 or higher
- Maven
- Docker and Docker Compose

## 🛠️ Setup and Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd BITS-Assignment
```

2. Start the PostgreSQL database using Docker Compose:
```bash
docker-compose up -d
```

3. Build the application:
```bash
./mvnw clean install
```

4. Run the application:
```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## 🗄️ Database Configuration

The application uses PostgreSQL with the following default configuration:
- Database Name: books
- Username: bits
- Password: bits
- Port: 5432

## 🧪 Testing

Run the tests using Maven:
```bash
./mvnw test
```

## 📦 Project Structure

```
src/
├── main/
│   ├── java/        # Java source files
│   └── resources/   # Configuration files
└── test/           # Test files
```

## 🔧 Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Starter Validation
- PostgreSQL Driver
- JUnit Jupiter
- Mockito

## 📝 License

This project is licensed under the MIT License.

## 👥 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request 