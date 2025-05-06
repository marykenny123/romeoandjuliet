package org.example;

public class OtherCharacters {
    private String name;
    private String role;


    public OtherCharacters(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String introduceOthers() {
        return "Hi, I'm " + this.name + " and I'm " + role + ".";
    }
}
