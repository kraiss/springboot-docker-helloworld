package com.github.kraiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String hello() {
        return "Hello from SpringBoot on Docker!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
