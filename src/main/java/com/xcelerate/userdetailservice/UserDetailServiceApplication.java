package com.xcelerate.userdetailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the User Detail Service application.
 * <p>
 * This is a Spring Boot application responsible for managing user details
 * within a microservice architecture. It provides RESTful APIs for creating,
 * updating, retrieving, and deleting user information.
 * </p>
 *
 * <p>
 * The application is designed to be highly scalable, modular, and secure, using
 * technologies such as Spring Boot, Spring Data JPA, and Hibernate for data
 * persistence. It can easily integrate with other microservices in the ecosystem
 * and is built with industry-standard best practices.
 * </p>
 *
 * <p>
 * To run the application, simply execute the main method which will bootstrap
 * the Spring application context and auto-configure all necessary components.
 * </p>
 *
 * @see SpringApplication
 * @see org.springframework.boot.autoconfigure.SpringBootApplication
 * @author to-jinalmodi
 * @since 2024
 */
@SpringBootApplication
public class UserDetailServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserDetailServiceApplication.class, args);

	}

}
