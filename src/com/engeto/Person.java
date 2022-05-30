package com.engeto;

public class Person {
    public enum PersonType {
        EMPLOYEE, CONTRACTOR, GUEST
    }

    private int ID;
    private String name;
    private String surname;
    private PersonType type;
    private int tickets;

    public Person(int ID, String name, String surname, PersonType type, int tickets) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.tickets = tickets;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}
