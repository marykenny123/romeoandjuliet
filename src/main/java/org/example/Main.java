package org.example;

import javax.print.attribute.standard.MediaSize;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // abro 3 clases, por el momento sin encapsular para comenzar más sencillo
    public static void main(String[] args) {

        Capulet juliet = new Capulet("Juliet", "la protagonista feminina.") ;
        Capulet ladyCapulet = new Capulet("Lady Capulet", "la madre de Juliet");
        Capulet lordCapulet = new Capulet("Lord Capulet", "el padre de Juliet");
        Capulet tybalt = new Capulet("Tybalt Capulet", "el primo de Juliet");

        Montague romeo = new Montague("Romeo", "el protagonista masculino");
        Montague lordMontague = new Montague("Lord Montague", "el padre de Romeo");
        Montague ladyMontague = new Montague("Lady Montague", "la madre de Romeo");
        Montague benvolio = new Montague("Benvolio", "el primo y amigo de Romeo");

        OtherCharacter nurse = new OtherCharacter("enfermera", "la enfermera de Juliet");
        OtherCharacter monk = new OtherCharacter("Fray Lorenzo", "el fraile que casa a Romeo y Juliet.");


        System.out.println("***** Conocer a los Capulet! *****");
        System.out.println(juliet.introduceCapulets());
        System.out.println(ladyCapulet.introduceCapulets());
        System.out.println(lordCapulet.introduceCapulets());
        System.out.println(tybalt.introduceCapulets());

        System.out.println("\n***** Conocer a los Montague! *****");
        System.out.println(romeo.introduceMontagues());
        System.out.println(lordMontague.introduceMontagues());
        System.out.println(ladyMontague.introduceMontagues());
        System.out.println(benvolio.introduceMontagues());

        System.out.println("\n***** Conocer a los otros personajes! *****");
        System.out.println(nurse.introduceOthers());
        System.out.println(monk.introduceOthers());

    }
}