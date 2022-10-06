package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Test_Apllication {

    public static void main(String[] args) {
        SpringApplication.run(Test_Apllication.class, args);
    }

}
