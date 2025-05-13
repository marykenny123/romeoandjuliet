package org.example;

public class OtherCharacter {
    private String name;
    private String role;


    public OtherCharacter (String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String introduceOthers() {
        return "Hola, soy " + this.name + " y soy " + role + ".";
    }
}
