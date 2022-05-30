package com.engeto;

import java.time.LocalDate;
import java.util.Objects;
//toto dolu pridala java ako prve pri cervenej ziarovke.
public class Customer implements Comparable<Customer> {
    @Override
    public int compareTo(Customer customer) {
        return 0;
    }
//    private int id;
//    private String name;
//    private LocalDate dateOfBirth;
//
//    public Customer(int id, String name, LocalDate dateOfBirth) {
//        this.id = id;
//        this.name = name;
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Customer customer = (Customer) o;
//        return id == customer.id;
//    }
//
//    // Rychlý filtr, který vyřadí prvky, které se určitě neshodují
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//
//    @Override
//    public String toString() {
//        return name + " (" + id+ ", " + dateOfBirth + ")";
//    }
//
//    @Override
//    public int compareTo(Customer other) {
//        int compareNames = name.compareTo(other.name);
//        if (compareNames == 0) {
//            return dateOfBirth.compareTo(other.dateOfBirth);
//        }
//        return compareNames;
//    }
//
//    public LocalDate getDateOfBirth() {
//        return dateOfBirth;
//    }
}
