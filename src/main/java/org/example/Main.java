package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // abro 3 clases, por el momento sin encapsular para comenzar más sencillo
    public static void main(String[] args) {

        Capulets juliet = new Capulets("Juliet", "the main female character") ;
        Capulets ladyCapulet = new Capulets("Lady Capulet", "Juliet's mother");
        Capulets lordCapulet = new Capulets("Lord Capulet", "Juliet's father");
        Capulets tybalt = new Capulets("Tybalt Capulet", "Juliet's cousin");

        Montagues romeo = new Montagues("Romeo", "the main male character");
        Montagues lordMontague = new Montagues("Lord Montague", "Romeo's father");
        Montagues benvolio = new Montagues("Benvolio", "Romeo's cousin and friend");

        System.out.println("***** Pls meet the Capulets! *****");
        System.out.println(juliet.introduceCapulets());
        System.out.println(ladyCapulet.introduceCapulets());
        System.out.println(lordCapulet.introduceCapulets());
        System.out.println(tybalt.introduceCapulets());

        System.out.println("***** Pls meet the Montagues! *****");
        System.out.println(romeo.introduceMontagues());

    }
}