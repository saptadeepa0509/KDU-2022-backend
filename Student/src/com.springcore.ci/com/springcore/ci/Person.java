package com.springcore.ci;

public class Person {
    private String name;
    private int personId;
    private Certificate certificate1;


    public Person(String name, int personId, Certificate certificate1) {
        this.name = name;
        this.personId = personId;
        this.certificate1 = certificate1;
    }

    @Override
    public String toString() {
        return this.name+" : "+this.personId +" : "+this.certificate1.getCourseName();
    }
}
