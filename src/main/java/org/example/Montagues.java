package org.example;

public class Montagues {
    private String name;
    private String role;


    public Montagues (String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String introduceMontagues () {
        return "Hi, I'm a Montague. My name is " + this.name + " and I'm " + role + ".";
    }


}