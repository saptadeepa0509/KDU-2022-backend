package com.company.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.company.aop")
public class ApplicationConfig {
}
