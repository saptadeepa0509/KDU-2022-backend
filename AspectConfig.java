package com.company.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {

    @Pointcut("execution(public * *(..))")
    public void anyPublicMethod() {
    }

    @Before("anyPublicMethod()")
    public void logBeforeAdd(JoinPoint joinPoint) {
        System.out.println("Before : " + joinPoint.getSignature().getName());
    }

    @After("anyPublicMethod()")
    public void logAfterAdd(JoinPoint joinPoint) {
        System.out.println("After : " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "anyPublicMethod()", returning = "result")
    public void logAfterReturn(int result) {
        System.out.println("After Return " + result);
    }


    @Pointcut("within(com.company.aop..*)")
    public void anyMethod(){

    }

    @Pointcut("execution(public String *(..))")
    public void Args(){
    }
    
    @Before("Args()")
    public void Before(JoinPoint joinPoint){
        System.out.println("before" +" "+joinPoint.getSignature().getName());
    }
    @After("Args()")
    public void After(JoinPoint joinPoint){
        System.out.println("After" +" "+joinPoint.getSignature().getName());
    }

}
