# GET25040---Springboot-evaluation-project-

## To Run the Project
```bash
mvn spring-boot:run
```

##  Submit Feedback
```bash
curl -X POST http://localhost:8080/feedback -H "Content-Type: application/json" -d '{"name": "John Doe", "email": "john@example.com", "message": "Great API! Keep it up."}'
```

## Get All Feedback
```bash
curl http://localhost:8080/feedback
```

##  Run Tests
```bash
mvn test
```

---
Replace `feedback_db` with your database name and  `YOUR_PASSWORD` with your actual PostgreSQL password in [application.properties](src/main/resources)
