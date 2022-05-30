package com.engeto.dumplings;

import java.time.LocalDate;
import java.util.ArrayList;

// Zde říkáme, že chceme používat třídu LocalDate z knihoven Javy.
public class Race {
    int year;
    String title;
    LocalDate date;
    Racer winner;


//    Zkus si nyní napsat konstruktor pro třídu Race. Vyjdi z následujících požadavků:
//    Vždy je třeba zadat ročník soutěže pomocí parametru.
//    Výchozí hodnota pro atribut winner bude null – proměnná zůstane „prázdná“, vítěz zatím nebude stanoven.
    public Race(int year, String title, LocalDate date,Racer winner) {
        this.year = year;
        this.title = title;
        this.date = date;
        this.winner = null;
    }
//    Jako výchozí datum soutěže použij dnešní: LocalDate.now(). Umožni ale využít nastavení pomocí parametru konstruktoru (budeš tedy potřebovat alespoň dva konstruktory).

    public Race(int year, String title) {
        this(year,title,LocalDate.now());
    }

    //    Výchozí název závodu bude: "Švestka Cup". Umožni ale změnit název v rámci jednoho z konstruktorů.
    public Race(int year) {
        this(year,"Švestka Cup");
    }

    public Race(int year, String title, LocalDate now) {
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Racer getWinner() {
        return winner;
    }

    public void setWinner(Racer winner) {
        this.winner = winner;
    }




//    Možná tě napadne, že by bylo jednodušší vrátit v metodě getRacers
//    přímo seznam listOfRacers jako výsledek. Metoda getRacers by pak byla
//    klasická přístupová metoda. Šlo by to. Ale teď to nechceme, protože by pak mohlo dojít k tomu, že někdo napíše následující kód:

    //    Zkus přidat do třídy Race seznam závodníků.
//
//    Přidej atribut listOfRacers.
    ArrayList<Racer> listOfRacers = new ArrayList<>();

    //    Přidej metodu addRacer, která do seznamu přidá jednoho závodníka.
    //public void addRacer() {
    //    listOfRacers.add(new Racer());
    //}
    public void addRacer(Racer newRacer) {
        listOfRacers.add(newRacer);
    }
    //    Přidej metodu removeRacer, která odebere ze seznamu zadaného závodníka.
    public void removeRacer(Racer racer) {
        listOfRacers.remove(racer);
    }
    //    Přidej metodu getRacers.
    //      Metoda vytvoří a vrátí nový ArrayList pro uložení závodníků.
    public ArrayList<Racer> getRacers() {
        //      Ve vráceném seznamu budou všichni závodníci z atributu listOfRacers.
        return new ArrayList<Racer>(listOfRacers);
    }
}
