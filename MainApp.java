package com.company.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.time.LocalDate;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee employee = context.getBean(Employee.class);
        employee.setName("shree");
        employee.setId("e1");
        System.out.println(employee.getName());
        EmployeeWork employeeWork = context.getBean(EmployeeWork.class);
        employeeWork.dowork("AWS");
        employeeWork.dowork("Backend");
        employee.setDateOfBirth(LocalDate.now());
        System.out.println(employee.getDateOfBirth());
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Employee>> violations = validator.validate(employee);
        for (ConstraintViolation<Employee> violation : violations) {
            System.out.println(violation.getMessage());
        }

    }
}
