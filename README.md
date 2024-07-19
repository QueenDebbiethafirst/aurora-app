# Aurora App

Aurora App is a Spring Boot application designed to demonstrate the use of Spring Boot for creating RESTful web services. This application includes a custom `HelloController` that returns a personalized message, showcasing a basic setup and deployment of a Spring Boot application.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Running the Application](#running-the-application)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features

- Spring Boot Framework: Utilizes Spring Boot for rapid application development.
- Custom Greeting Endpoint: Provides a `/hello` endpoint that returns a personalized message.
- Built-in Tomcat Server: Comes with an embedded Tomcat server for ease of deployment.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 17: This application is built with Java 17. Install it from the [official Oracle website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
- Apache Maven 3.6.3: Used for building the project. Download it from the [Apache Maven website](https://maven.apache.org/download.cgi).

## Installation

Follow these steps to set up the project on your local machine:

1. Clone the Repository:

   ```bash
   git clone https://github.com/yourusername/aurora-app.git
   ```

2. Navigate to the Project Directory:

   ```bash
   cd aurora-app
   ```

3. Build the Project:

   ```bash
   mvn clean package
   ```

## Usage

To run the application, execute the following command:

```bash
java -jar target/aurora-app-1.0-SNAPSHOT.jar
```

The application will start and listen on port `8080` by default.

## Running the Application

1. Start the Application:

   ```bash
   java -jar target/aurora-app-1.0-SNAPSHOT.jar
   ```

2. Access the Application:
   Open your web browser and navigate to:

   ```
   http://localhost:8080/hello
   ```

   You should see:

   ```
   Hello World!, This is Aanu, My first Java Script. How is learning going?
   ```

## Endpoints

- GET /hello: Returns a custom greeting message.

## Contributing

Contributions to the `aurora-app` project are welcome! If you have suggestions or improvements, please follow these steps:

1. Fork the Repository.
2. Create a New Branch (`git checkout -b feature/your-feature`).
3. Commit Your Changes (`git commit -am 'Add new feature'`).
4. Push to the Branch (`git push origin feature/your-feature`).
5. Create a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
