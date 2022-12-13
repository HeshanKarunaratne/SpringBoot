package com.example.heshan.SpringBoot.dto;

import java.util.List;

public record GreetResponse(String greet, List<String>favProgrammingLanguages, Person person) {
}
