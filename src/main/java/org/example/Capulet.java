package org.example;

public class Capulet {
    // de moment public para hacerlo en Main sin getters + setters - falta cambiar a private
    public String name;
    public String role;


    public Capulet (String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String introduceCapulets () {
        return "Hola, soy de la familia Capulet. Soy " + this.name + " y soy " + role + ".";
    }

}
