package com.engeto;

import java.util.ArrayList;
import java.util.List;
public class MainPerson {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Karel", "Dvořák", Person.PersonType.CONTRACTOR, 10));
        persons.add(new Person(2, "Ivana", "Merhautová", Person.PersonType.CONTRACTOR, 30));
        persons.add(new Person(3, "Anna", "Černá", Person.PersonType.GUEST, 1));

        for (int i = 0; i <= 20; i++) {
            persons.add(new Person(i, "" + i, "unknown", Person.PersonType.GUEST, 0));
        }
        //Zapiš kód, který spočítá počet hostů v listu.
        int numberOfGuests = 0;
        for (Person person : persons) {
            if (person.getType().equals(Person.PersonType.GUEST))
                    numberOfGuests =+1;
        }
        System.out.println("Počet hostů: "+numberOfGuests);
        //Zapiš kód, který vypíše křestní jména všech zaměstnanců.
        System.out.println("Zaměstnanci (křestní jména):");
        persons.forEach(person ->
            {if(person.getType().equals(Person.PersonType.EMPLOYEE))
                System.out.println(person.getName());
            });
        //Zapiš kód, který spočítá průměrný počet tiketů na osobu (všechny typy osob).
        int sum = 0;
        for(Person person: persons){
            sum += person.getTickets();
        }
        System.out.println("Pocet tiketu :" + sum / persons.size());
        //Zapiš kód, který:
        //pro externisty vypíše jméno ve formátu: Externí pracovník: Karel Dvořák
        //pro hosty: Návštěva: Ivan Kratochvíl
        //a pro ostatní typy: Eva Karásková (ID: 876).
        for(Person person: persons){
            if (person.getType().equals(Person.PersonType.CONTRACTOR)){
                System.out.println("Externi pracovnik :"+person.getName()+person.getSurname());
            }else if(person.getType().equals(Person.PersonType.GUEST)){
                System.out.println("Navsteva:" +person.getName()+person.getSurname());
            }else{
                System.out.println(person.getName()+person.getSurname()+"(ID:"+person.getTickets()+")");
            }

        }
        //Ich riesenie
        for (Person person : persons) {
            String fullName = person.getName() + " "+ person.getSurname();
            System.out.println(
                    switch (person.getType()) {
                        case CONTRACTOR -> "Externí pracovník: "+fullName;
                        case GUEST -> "Návštěva: "+fullName;
                        default -> fullName + " ("+person.getTickets()+")";
                    }
            );
        }
    }
}
