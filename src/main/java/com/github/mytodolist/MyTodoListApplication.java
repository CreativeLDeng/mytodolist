package com.github.mytodolist;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyTodoListApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MyTodoListApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
