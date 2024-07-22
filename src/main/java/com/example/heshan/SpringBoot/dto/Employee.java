package com.example.heshan.SpringBoot.dto;

import com.example.heshan.SpringBoot.annotation.ValidateEmployeeType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Employee {
    @NotBlank
    private String name;
    private int age;

    @Email
    private String email;

    @ValidateEmployeeType
    private String empType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public Employee() {
    }

    public Employee(String name, int age, String email, String empType) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.empType = empType;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + ", empType='" + empType + '\'' + '}';
    }
}
