package com.deep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.deep"})
public class AppFeed {
    public static void main(String[] args) {
        SpringApplication.run(AppFeed.class, args);
    }
}
