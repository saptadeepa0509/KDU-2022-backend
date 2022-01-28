package com.company.aop;


import org.springframework.stereotype.Component;

@Component
public class Operation {
    public Integer substract(int a, int b) {
        System.out.println("Inside substact");
        if (a > b) return a - b;
        else if (b > a) return b - a;
        else
            return 0;
    }
    public String printmessage(String m){
        return m;
    }


}


