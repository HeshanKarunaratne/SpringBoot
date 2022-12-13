package com.example.heshan.SpringBoot.controller;

import com.example.heshan.SpringBoot.dto.GreetResponse;
import com.example.heshan.SpringBoot.dto.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetController {

    @GetMapping("/")
    public GreetResponse greet() {
        return new GreetResponse("Hello", List.of("Java", "Golang"), new Person("Heshan", 28, 30_000));
    }

}
