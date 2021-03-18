package com.snnu.yygh.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.snnu")
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
