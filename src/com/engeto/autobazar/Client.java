package com.engeto.autobazar;

import java.time.LocalDate;

public class Client {
    String name;
    String address;
    boolean isVip = false;
    LocalDate dateOfBirth = null;

    public Client(String name, String address, boolean isVip, LocalDate dateOfBirth) {
        this.name = name;
        this.address = address;
        this.isVip = isVip;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
