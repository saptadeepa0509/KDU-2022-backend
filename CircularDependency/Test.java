package com.company.CircularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/company/CircularDependency/config.xml");
        A a= (A) context.getBean("aref");
        B b=(B)context.getBean("bref");
        System.out.println(a);
        System.out.println(b);
    }
}
