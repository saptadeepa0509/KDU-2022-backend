package com.company.lifecycle;

public class Pizza {
    private double price;

    public double getPrice() {
        return price;
    }

    public Pizza() {
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                '}';
    }

    public void setPrice(double price) {
        System.out.println("setting price");
        this.price = price;
    }

    public void init() {
        System.out.println("inside -init method");
    }

    public void destroy() {
        System.out.println("inside -destroy method");
    }
}
