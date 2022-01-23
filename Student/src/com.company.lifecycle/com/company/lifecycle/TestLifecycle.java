package com.company.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("configLifecycle.xml");
        Pizza p1 = (Pizza) applicationContext.getBean("pizza1");
        System.out.println(p1);
        applicationContext.registerShutdownHook();
        Burger b1= (Burger) applicationContext.getBean("Burger1");
        System.out.println(b1);
    }
}
