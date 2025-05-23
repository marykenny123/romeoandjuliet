package org.example;

final public class Actor extends Person {
    // nota --- pongo final para que no se puede dar herencia a otra clase
    private String name;
    private String role;
    private String film;
    private int filmYear;


    public Actor (String name, String role, String film, int filmYear) {
        super(name,role);
        this.film = film;
        this.filmYear = filmYear;
    }

//    public String introduce() {
//        return "Hi, I'm " + super.getName() + ". I played " + super.getRole() +
//        " and I starred in " + this.film +  ", released in " + this.filmYear + ".";
//    }

    // otra posibilidad:
    public String introduce() {
        return super.introduce() + " I was in " + this.film + ", released in " + this.filmYear + ". *** ejemplo concatenar";
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


}
