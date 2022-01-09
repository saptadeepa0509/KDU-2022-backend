package com.kickdrum;

public class Credential {
    private String name;
    private int id;

    private Credential() {
        this.name="";
        this.id=0;
    }

    public static Credential fun(){
        return new Credential();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Credential{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
