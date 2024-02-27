# Employee Management System

This is a simple Employee Management System built using Spring Boot, which provides RESTful APIs for managing employees and departments.

## Features

- CRUD operations for Employees and Departments.
- RESTful APIs for managing employees and departments.
- Uses Spring Data JPA for data persistence.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Java
- Maven

## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/pranavchaudhari571/Employee_Management_System
    ```

2. Navigate to the project directory:

    ```bash
    cd Employee_Department
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

## REST Endpoints

### Employee Controller

- **GET /employees**: Get all employees.
- **GET /employees/{id}**: Get employee by ID.
- **POST /employees**: Create a new employee.
- **PUT /employees/{id}**: Update an existing employee.
- **DELETE /employees/{id}**: Delete an employee by ID.

### Department Controller

- **GET /departments**: Get all departments.
- **GET /departments/{id}**: Get department by ID.
- **POST /departments**: Create a new department.
- **PUT /departments/{id}**: Update an existing department.
- **DELETE /departments/{id}**: Delete a department by ID.

## Contributing

Contributions are welcome! If you find any issues or want to contribute to the project, feel free to open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
