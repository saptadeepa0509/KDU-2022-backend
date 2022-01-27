package com.company.CircularDependency;

public class B {
    private A a;

    public B(A a) {
        this.a = a;
    }
}
