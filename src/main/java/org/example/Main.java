package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // abro 3 clases, por el momento sin encapsular para comenzar más sencillo
    public static void main(String[] args) {

        Character juliet = new Character("Juliet", "the lead female character", 13);
        Character tybalt = new Character("Tybalt Capulet", "Juliet's cousin", 20);
        Character romeo = new Character("Romeo", "the lead male character", 16);
        Character benvolio = new Character("Benvolio", "Romeo's cousin and friend", 16);


        Actor julietActor1 = new Actor("Olivia Hussey", "Juliet", "Romeo and Juliet", 1968);
        Actor romeoActor1 = new Actor("Leonard Whiting", "Romeo", "Romeo and Juliet", 1968);
        Actor julietActor2 = new Actor("Claire Danes", "Juliet", "William Shakespeare's Romeo + Juliet", 1996);
        Actor romeoActor2 = new Actor("Leonardo di Caprio", "Romeo", "William Shakespeare's Romeo + Juliet", 1996);

        System.out.println(romeo.getAge());

        System.out.println(juliet.introduce());
        System.out.println(tybalt.introduce());
        System.out.println(julietActor1.introduce());
        System.out.println(romeoActor2.introduce());
        System.out.println(benvolio.introduce());
        romeoActor2.phoneAgent();
        benvolio.eat();
        julietActor1.phoneAgent();
        tybalt.sleep();
        romeoActor1.sleep();
        julietActor1.wakeUp();
        juliet.wakeUp();
        julietActor2.payAgent();

    }
}