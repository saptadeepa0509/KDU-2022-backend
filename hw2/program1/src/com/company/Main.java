package com.company;

import com.kickdrum.Credential;

public class Main {

    public static void main(String[] args) {
        Credential credential= Credential.fun();
        credential.setId(2);
        credential.setName("kick-drum");
        System.out.println(credential.getName());
        System.out.println(credential.getId());
        System.out.println(credential.toString());
    }
}

