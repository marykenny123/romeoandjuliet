package org.example;

public class Montague {
    public String name;
    public String role;

public Montague (String name, String role) {
    this.name = name;
    this.role = role;
    }

public String introduceMontagues() {
    return "Hola, soy de la familia Montague. Soy " + this.name + " y soy " + this.role + ".";
}

}
