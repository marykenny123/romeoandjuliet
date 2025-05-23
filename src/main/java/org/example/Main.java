package org.example;

import javax.print.attribute.standard.MediaSize;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // abro 3 clases, por el momento sin encapsular para comenzar más sencillo
    public static void main(String[] args) {

        Character juliet = new Character("Juliet", "the lead female character", 13);
        Character tybalt = new Character("Tybalt Capulet", "Juliet's cousin", 20);
        Character romeo = new Character("Romeo", "the male lead character", 16);
        Character benvolio = new Character("Benvolio", "Romeo's cousin and friend", 16);


        Actor juliet60s = new Actor("Olivia Hussey", "Juliet", "Romeo and Juliet", 1968);
        Actor romeo60s = new Actor("Leonard Whiting", "Romeo", "Romeo and Juliet", 1968);
        Actor juliet90s = new Actor("Claire Danes", "Juliet", "William Shakespeare's Romeo + Juliet", 1996);
        Actor romeo90s = new Actor("Leonardo di Caprio", "Romeo", "William Shakespeare's Romeo + Juliet", 1996);

        //juliet.setAge(99);
        System.out.println(juliet.getAge());
        System.out.println(juliet.introduce());
        System.out.println(romeo.introduce());
        System.out.println(juliet60s.introduce());
        System.out.println(romeo90s.introduce());

        System.out.println(romeo.introduce());

        System.out.println(juliet.introduce());
    // apuntes --- clase abstracta = plantilla, no se puede instanciar objetos,
        //si un metodos es abstracto la clase tiene que ser abstracta pero una clase abstracta
        //puede tener atributos y otros metodos concretos

        // interface especifica que metodos debe implementar una clase
        //contrato entre clases
        // los metodos son por defecto publicos y abstractos
        // atributos - pueden tener constantes ya definidos con un valor, no puede tener instancias




    }
}