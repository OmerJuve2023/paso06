package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDeployApplication.class, args);
        try {
            System.out.println("cargado con exito");
        } catch (Exception e) {
            System.out.println("errorrrrrrr");
            e.printStackTrace();
        }

    }

}
