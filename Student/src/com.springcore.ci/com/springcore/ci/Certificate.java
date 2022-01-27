package com.springcore.ci;

public class Certificate {
    private String courseName;

    public Certificate(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return this.courseName;
    }
}
