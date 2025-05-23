package org.example;

public class Character extends Person {
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
}
