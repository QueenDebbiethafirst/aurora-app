package com.aanu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("Hello World!, This is Aanu, My first Java Script. How is learning going?");
    }
}

@RestController
@RequestMapping("/hello")
class HelloController {
    @GetMapping
    public String sayHello() {
        return "Hello World!, This is Aanu, My first Java Script. Operating on my Console and web server, How is learning going on your end?";
    }
}
