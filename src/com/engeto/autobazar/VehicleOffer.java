package com.engeto.autobazar;

import com.engeto.dumplings.Race;

import java.util.ArrayList;

public class VehicleOffer {
    ArrayList<Vehicle> offer = new ArrayList<>();

    public void addNewCar(Vehicle newVehicle){
        offer.add(newVehicle);
    }
    public void removeCar(Vehicle vehicleToRemove){
        offer.remove(vehicleToRemove);
    }

    public int numberOfCars(){
        /**
         * Return the number of cars currently in offer.
         * @return number of cars in offer
         */
        return offer.size();
    }

    public void printAllCars() {
        for (Vehicle vehicle: offer){
            System.out.println(vehicle.getMake()+ " ("+ vehicle.getPrice()+")");
        }
    }
}

//    Navážeme na projekt z minulé lekce.
//    Zkus připravit třídu VehicleOffer, popisující aktuální nabídku automobilů pro informační systém autobazaru.
//
//    Máme následující požadavky:
//    Využijeme třídu pro popis modelu dat z projektu Autobazar z minulé lekce.
//    Nevíme předem, kolik vozidel budeme mít v nabídce – počet se bude měnit.
//    Celou nabídku vozidel bychom chtěli umístit do jedné třídy, která bude poskytovat následující operace:
//        přidání vozidla do nabídky,
//        odebrání vozidla z nabídky,
//        zjištění počtu aktuálně nabízených vozidel,
//        výpis seznamu všech aktuálně nabízených vozidel na obrazovku (u každého vypíšeme model a cenu).