package org.example;

import org.example.interfaces.Agent;
import org.example.interfaces.DailyRoutine;

public class Actor extends Person implements DailyRoutine, Agent {
//    private String name;  --> no hay que poner este variable pq está ya en Character
//    private String role;  --> no hay que poner este variable pq está ya en Character
    private String film;
    private int filmYear;


    public Actor (String name, String role, String film, int filmYear) {
        super(name,role);
        this.film = film;
        this.filmYear = filmYear;
    }

    public String getFilmName() {
        return this.film;
    }

    public void setFilmName(String filmName) {
        this.film = film;
    }

    public int getFilmYear() {
        return filmYear;
    }

    public void setFilmYear(int filmYear) {
        this.filmYear = filmYear;
    }

    public String introduce() {
        return "Hi, my name is " + super.getName() + ". I played " + super.getRole() + " in the film " + this.film + " released in " + this.filmYear + ".";
    }

    @Override
    public void wakeUp() {
        System.out.println("I'm " + super.getName() + " and I woke up very early for filming every day.");
    }

    @Override
    public void eat() {
        System.out.println("I'm " + super.getName() + " and I ate my lunch with the other actors.");

    }

    @Override
    public void sleep() {
        System.out.println("I'm " + super.getName() + ". I slept very little during filming.");

    }

    @Override
    public void phoneAgent() {
        System.out.println("I'm " + super.getName() + " and I phone my agent every week.");
    }

    @Override
    public void payAgent() {
        System.out.println("I'm " + super.getName() + " and I pay my agent commission after each film.");
    }
}
