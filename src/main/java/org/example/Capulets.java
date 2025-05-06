package org.example;

public class Capulets {
    // de moment public para hacerlo en Main sin getters + setters - falta cambiar a private
    public String name;
    public String role;


    public Capulets (String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String introduceCapulets () {
        return "Hi, I'm a Capulet. My name is " + this.name + " and I'm " + role + ".";
    }

}
