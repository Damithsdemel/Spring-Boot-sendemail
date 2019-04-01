package com.email.emailtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
public class EmailtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailtestApplication.class, args);
    }


}
