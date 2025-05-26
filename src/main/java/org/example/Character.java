package org.example;

import org.example.interfaces.DailyRoutine;

public class Character extends Person implements DailyRoutine {
    private int age; // invented age


    public Character (String name, String role, int age) {
        super(name, role);
        this.age = age;
    }

    public String introduce () {
        return "Hi, I'm " + super.getName() + ". I'm " + super.getRole() + " and I'm " + this.age + " years old.";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void wakeUp() {
        System.out.println("I'm " + super.getName() + " and I don't get up early.");

    }

    @Override
    public void eat() {
        System.out.println("I'm " + super.getName() + " and I eat at banquets.");

    }

    @Override
    public void sleep() {
        System.out.println("I'm " + super.getName() + "and I can sleep lots.");

    }
}
