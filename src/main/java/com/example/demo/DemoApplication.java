package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("adasdasd");
        SpringApplication.run(DemoApplication.class, args);
    }
    public String addTest() {
        return "hellow";
    }

}
