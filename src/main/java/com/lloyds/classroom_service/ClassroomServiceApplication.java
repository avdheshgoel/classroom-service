package com.lloyds.classroom_service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication(scanBasePackages = {"uk.co.sainsburys"})
public class ClassroomServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassroomServiceApplication.class, args);
    }

}
