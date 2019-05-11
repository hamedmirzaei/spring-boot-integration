# Spring Boot + Spring Integration

This is a simple example to show you how Spring Integration works with Spring Boot.

# Libraries and Tools
* [Module] [`Spring Boot`](https://spring.io/projects/spring-boot)
* [Module] [`Spring Integration`](https://spring.io/projects/spring-integration)
* [Library for auto-generating getters, setters, constructors and others] [`Lombok`](https://projectlombok.org/)
* [Tool for sending HTTP requests] [`Postman`](https://www.getpostman.com/tools)

# How it works
It is just a maven Spring Boot application which you can build and run it like any other Spring Boot application.
After running it, you should send a `GET` http request to url http://localhost:8080/welcome/NAME with 
`Content-Type:application/json` as the Header variable.
