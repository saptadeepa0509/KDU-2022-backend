package com.company.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Operation operation=context.getBean(Operation.class);
        System.out.println(operation.substract(5,9));
        System.out.println(operation.printmessage("printing message"));
    }
}
