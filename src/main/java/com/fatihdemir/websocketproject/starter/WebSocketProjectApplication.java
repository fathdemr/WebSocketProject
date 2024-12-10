package com.fatihdemir.websocketproject.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.fatihdemir.websocketproject.controller"})
@ComponentScan(basePackages = {"com.fatihdemir.websocketproject.repository"})
@EntityScan(basePackages = "com.fatihdemir.websocketproject.entity")
public class WebSocketProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSocketProjectApplication.class, args);
    }

}
