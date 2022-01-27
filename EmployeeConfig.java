package com.company.Annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class EmployeeConfig {
    @Bean
    public Employee employee() {
        return new Employee();
    }

    @Bean
    public EmployeeWork EmployeeWork() {
        return new EmployeeWork();
    }

}
