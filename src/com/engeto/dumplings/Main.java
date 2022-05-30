package com.engeto.dumplings;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

//    private static Racer createRacer(String name, LocalDate born, int result) {
//        Racer newRacer = new Racer();
//        newRacer.setName(name);
//        newRacer.setBorn(born);
//        newRacer.setNumberOfDumplings(result);
//        newRacer.isFinalResult(false);
//        return newRacer;
//    }
    // Metoda už je tak jednoduchá, že ji ani nepotřebujeme:
    // private static Racer createRacer(String name, LocalDate born, int result) {
    //    Racer newRacer = new Racer(name, born, result);
    //    return newRacer;
    //}
    public static void main(String[] args) {
//        Racer firstRacer = new Racer();   // První závodník.
//        Racer secondRacer = new Racer();  // Vytvoříme druhý objekt - druhého závodníka.
        String chucksName;
        Racer chuck;
        Race todaysRace;
        Race race2017;
        Race race2018;
        Race race2019;
//        chuck = new Racer();

        ArrayList<Racer> listOfRacers = new ArrayList<>();
        Racer racer1 = new Racer("Karel",LocalDate.of(2000,2,1));
        listOfRacers.add(racer1);
        listOfRacers.add(new Racer("Anna", LocalDate.of(2007,10,19)));
        ArrayList<Racer> copyOfList = new ArrayList<Racer>(listOfRacers);
        System.out.println(listOfRacers.get(1).getName()); // Vypíše: "Anna"
        System.out.println(listOfRacers.get(0).getName()); // Vypíše: "Karel"
        listOfRacers.remove(racer1);
        // Poté co odstraníme z listu Karla, zůstane už jen jeden objekt s indexem 0:
        listOfRacers.remove(0);
        for (Racer racer : listOfRacers) {
            System.out.println(racer.getName());
        }

        Racer firstRacer = new Racer("Radek", LocalDate.of(1999, 5, 1));
        Racer secondRacer = new Racer("Jana", LocalDate.of(2000, 12, 24));
        race2017 = new Race(2017);
        race2018 = new Race(2018);
        race2019 = new Race(2019);
        todaysRace = new Race(2022,"MČR Břicháč Cup");

        System.out.println(firstRacer.getName());  // -> "Radek"
        System.out.println(secondRacer.getName());  // -> "Radek"
        firstRacer.setName("Radomír");
        System.out.println(firstRacer.getName());  // -> "Radomír"
//        firstRacer.setName("Radek");
//        System.out.println(firstRacer.getName());  // Vypíše na obrazovku "Radek".
//        secondRacer.setName("Jana");
//        System.out.println(secondRacer.getName());  // Vypíše na obrazovku "Jana".
//        firstRacer.setName("Radomír");
//        System.out.println(firstRacer.getName());  // Vypíše na obrazovku "Radomír".

//      chuck.setName("Chuck Norris");
//      chuck.setBorn(LocalDate.of(1940,3,10));
//      chuck.setNumberOfDumplings(1000);
//      chuck.isFinalResult(false);
// kvoli sprehladneniu metody main bola vytvorena metod createRacer hore a tu ju pouzijem
//        chuck = createRacer("Chuck Norris", LocalDate.of(1940, 3, 10), 10000);
// po zavednie konstruktorov ju uz nebudeme potrebovat potom bude chuck vyzerat takto:
        chuck = new Racer("Chuck Norris",LocalDate.of(1940, 3, 10), 10000);
        chucksName = chuck.getName();
        System.out.println(chuck.getNumberOfDumplings());

//        todaysRace.setYear(2020);
//        todaysRace.setTitle("MČR Břicháč Cup"); uz je nastvene cez konstrutor hore,
//        todaysRace.setDate(LocalDate.of(2020,10,27));
        todaysRace.setWinner(chuck);

//      Vytvoř si v metodě main kolekci závodů (objekty třídy Race).
//      Uprav kód metody main tak, že závody race2017, race2018 a race2019 umístíš do kolekce.
//      Na konec zapiš kód, který vezme všechny závody z kolekce a vypíše u každého z nich ročník.
        ArrayList<Race> listOfRace = new ArrayList<>();
        listOfRace.add(new Race(2017,"race2017"));
        listOfRace.add(new Race(2018,"race2018"));
        listOfRace.add(new Race(2018,"race2019"));
        for (Race race: listOfRace){
            System.out.println(race.year);
        }

    }
}
