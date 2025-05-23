package org.example;

public class Person {
    private String name;
    private String role;

    public Person() {

    }


    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String introduce () {
    return "Hi, I'm " + this.name + ". I'm " + this.role + ".";
    }
    // si no ponemos método introduce en subclass se hereda de superclass (busca primero
    // en subclass y si no encuentra va al superclass a buscarlo

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}