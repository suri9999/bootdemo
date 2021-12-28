package com.example.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootdemoApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext ctx= SpringApplication.run(BootdemoApplication.class, args);

        User u1= ctx.getBean(User.class);
        u1.show();
    }

}
