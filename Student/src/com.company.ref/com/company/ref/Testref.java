package com.company.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testref{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/company/ref/refconfig.xml");
        A a= (A) applicationContext.getBean("aref");
        System.out.println(a.getX());
        System.out.println(a.getOb().getY());

    }
}
