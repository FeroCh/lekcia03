package com.engeto.vozovy_park;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Car {
    public String make;
    public String type;
    public String vehicleRegistrationPlate;
    public LocalDate lastTechnicalCheck;
    public BigDecimal mileage;

    public Car(String make, String type, String vehicleRegistrationPlate, LocalDate lastTechnicalCheck, BigDecimal mileage) {
        this.make = make;
        this.type = type;
        this.vehicleRegistrationPlate = vehicleRegistrationPlate;
        this.lastTechnicalCheck = lastTechnicalCheck;
        this.mileage = mileage;
    }
    public Car(String make, String type,LocalDate lastTechnicalCheck, BigDecimal mileage) {
        this.make = make;
        this.type = type;
        this.vehicleRegistrationPlate = "ENGETO00"; //netreba inkrementaciu v konstruktore,stacilo v main v slucke.
        this.lastTechnicalCheck = lastTechnicalCheck;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehicleRegistrationPlate() {
        return vehicleRegistrationPlate;
    }

    public void setVehicleRegistrationPlate(String vehicleRegistrationPlate) {
        this.vehicleRegistrationPlate = vehicleRegistrationPlate;
    }

    public LocalDate getLastTechnicalCheck() {
        return lastTechnicalCheck;
    }

    public void setLastTechnicalCheck(LocalDate lastTechnicalCheck) {
        this.lastTechnicalCheck = lastTechnicalCheck;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", type='" + type + '\'' +
                ", vehicleRegistrationPlate='" + vehicleRegistrationPlate + '\'' +
                ", lastTechnicalCheck=" + lastTechnicalCheck +
                ", mileage=" + mileage +
                '}';
    }
}


