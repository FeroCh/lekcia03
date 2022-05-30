package com.engeto.dumplings;

import java.time.LocalDate;

public class Racer {
    String name;    // Jméno závodníka - textový atribut s názvem “name”.
    LocalDate born; // Datum narození závodníka.
    int numberOfDumplings;
    // Počet snězených knedlíků - číselný atribut s názvem „numberOfDumplings“.
    boolean isFinalResult;
    // Skončil už závodník („true“), nebo ještě pokračuje v jídle („false“)?
    // Atribut s názvem „isFinalResult“, jehož hodnotou je pravda/nepravda.
    Category category = Category.NEWBIE;

    public Racer(String name, LocalDate born, int numberOfDumplings) {
        this.name = name;
        this.born = born;
        this.numberOfDumplings = numberOfDumplings;
     }

    public Racer(String name, LocalDate born) {
        this(name, born, 0);
        // Voláme konstruktor se třemi parametry, jako třetí parametr doplníme: 0

    }

    public Racer() {
        this("Anonymous racer", LocalDate.MIN);
    }

    public int addDumplings(int howMuch) {
       // this.numberOfDumplings = this.numberOfDumplings + howMuch; zjednodusene je to nizsie
        this.numberOfDumplings += howMuch;
        return this.numberOfDumplings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public int getNumberOfDumplings() {
        return numberOfDumplings;
    }

    public void setNumberOfDumplings(int numberOfDumplings) {
        this.numberOfDumplings = numberOfDumplings;
    }

    public boolean isFinalResult(boolean b) {
        return isFinalResult;
    }

    public void setFinalResult(boolean finalResult) {
        isFinalResult = finalResult;
    }

    public void setCategory(Category category) { this.category = category; }

    public Category getCategory() {return this.category;}
}
