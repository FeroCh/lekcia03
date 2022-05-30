package com.engeto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Employee {
    String name;
    LocalDate birthdate;
    List<Computer> computers = new ArrayList<>();
    public Employee(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public List<Computer> getComputers() {
        // Vrátíme kopii seznamu.
        // Pokud následně někdo v kopii provede změny, neovlivní tím
        //  náš seznam.
        return new ArrayList<>(computers);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}