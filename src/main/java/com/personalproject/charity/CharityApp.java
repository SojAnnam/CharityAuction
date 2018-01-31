package com.personalproject.charity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CharityApp {
    public static void main(String[] args) {

        System.out.println("Starting...");
        SpringApplication.run(CharityApp.class, args);

    }
}
