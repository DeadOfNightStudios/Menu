# Menu Microservice
Used to provide access to the menu items

# Tech Stack
- Java 8
- Spring Boot 2.3.1.RELEASE
- Maven 3.6.3

# Build & Run 

To build the code please run:

- mvn clean install

To build the application without test cases please run:

- mvn clean install -Dmaven.test.skip=true

To run the application please run:

- mvn exec:java -Dexec.mainClass=com.my.company.menu.MenuApplication