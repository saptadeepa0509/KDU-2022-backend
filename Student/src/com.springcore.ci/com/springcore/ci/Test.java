package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
        Person p1= (Person) applicationContext.getBean("person");
        System.out.println(p1);
    }
}
