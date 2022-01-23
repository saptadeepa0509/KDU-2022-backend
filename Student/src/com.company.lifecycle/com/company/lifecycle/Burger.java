package com.company.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Burger implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Burger() {
    }

    @Override
    public String toString() {
        return "Burger{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //init using interface
        System.out.println("having Burger");

    }

    @Override
    public void destroy() throws Exception {
        // destroy using interface
        System.out.println("Finished Having Burger");

    }
}
