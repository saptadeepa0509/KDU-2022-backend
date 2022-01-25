package com.company.Annotation;

import lombok.Data;

@Data
public class EmployeeWork {

    public void dowork(String course) {

        System.out.println("Working on" + " " + course);

    }
}
