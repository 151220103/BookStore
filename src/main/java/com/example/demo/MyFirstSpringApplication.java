package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = { "com.example.controller" })
@EnableJpaRepositories(basePackages = {"com.example.respository"})
@EntityScan(basePackages = {"com.example.entity"})
@SpringBootApplication
public class MyFirstSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstSpringApplication.class, args);
    }
}
