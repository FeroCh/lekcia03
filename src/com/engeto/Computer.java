package com.engeto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Computer {
//    String model;
//    double weight;
//    double monitorDiagonal;
//    boolean isCompanyComputer;
//    boolean isNotebook;
//    public Computer(String model, double weight, double monitorDiagonal, boolean isCompanyComputer, boolean isNotebook) {
//        this.model = model;
//        this.weight = weight;
//        this.monitorDiagonal = monitorDiagonal;
//        this.isCompanyComputer = isCompanyComputer;
//        this.isNotebook = isNotebook;
//    }
//    public Computer(String model, double weight) {
//        this(model, weight, 15.7, true, true);
//    }
//    public String getModel() {
//        return model;
//    }
//    public void setModel(String model) {
//        this.model = model;
//    }
//    public double getWeight() {
//        return weight;
//    }
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//    public double getMonitorDiagonal() {
//        return monitorDiagonal;
//    }
//    public void setMonitorDiagonal(double monitorDiagonal) {
//        this.monitorDiagonal = monitorDiagonal;
//    }
//    public boolean isCompanyComputer() {
//        return isCompanyComputer;
//    }
//    public void setCompanyComputer(boolean companyComputer) {
//        isCompanyComputer = companyComputer;
//    }
//    public boolean isNotebook() {
//        return isNotebook;
//    }
//    public void setNotebook(boolean notebook) {
//        isNotebook = notebook;
//    }
//}
    // Názvy tříd se píší notací PascalCase - první písmeno velké

    // Atributy třídy (angl. attributes):
    private String model; // proměnné: datový typ + název proměnné
    private double diagonal;
    private boolean isLaptop;
    private LocalDate dateOfPurchase;
    private int numOfCores;
    private BigDecimal purchasePrice;

    public Computer(String model, double diagonal, boolean isLaptop,
                    LocalDate dateOfPurchase, int numOfCores, BigDecimal purchasePrice) {
        this.model = model;
        this.diagonal = diagonal;
        this.isLaptop = isLaptop;
        this.dateOfPurchase = dateOfPurchase;
        this.numOfCores = numOfCores;
        this.purchasePrice = purchasePrice;
    }

    public Computer(LocalDate dateOfPurchase, BigDecimal purchasePrice) {
        this(
                "unspecified model",
                13.3, true, dateOfPurchase,
                0, purchasePrice);
//        this.model = "unspecified model";
//        this.diagonal = 13.3;
//        this.isLaptop = true;
//        this.dateOfPurchase = dateOfPurchase;
//        this.numOfCores = 0;
//        this.purchasePrice = purchasePrice;
    }

    public String getModel() {
        return model;
        // vrátí jako výsledek hodnotu atributu model
    }

    // public ... modifikátor přístupu - veřejná metoda
    // void ... nevrací žádnou návratovou hodnotu
    // název metody
    // kulaté závory s parametry
    public void setModel(String model) {
        this.model = model;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    // Refaktoring: změna názvu: Shift+F6

    public boolean isLaptop() {
        return isLaptop;
    }

    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public int getNumOfCores() {
        return numOfCores;
    }

    public void setNumOfCores(int numOfCores) {
        this.numOfCores = numOfCores;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getDescription() {
        return
                model + " (" + diagonal
                        +"\", "+dateOfPurchase+")";
    }

    public void printDescription() {
        System.out.println(
                getDescription()
        );
    }

    @Override
    public String toString() {
        return getDescription();
    }
}

