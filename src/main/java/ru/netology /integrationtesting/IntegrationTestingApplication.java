package ru.netology.integrationtesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class IntegrationTestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationTestingApplication.class, args);
    }
    @GetMapping("/")
    public String hello () {
        return "Hello from container!";
    }
}
