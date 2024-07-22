package com.example.heshan.SpringBoot.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class EmployeeTypeValidator implements ConstraintValidator<ValidateEmployeeType, String> {

    @Override
    public boolean isValid(String employeeType, ConstraintValidatorContext context) {
        List<String> employeeTypes = Arrays.asList("Permanent", "Contract");
        return employeeTypes.contains(employeeType);
    }
}
