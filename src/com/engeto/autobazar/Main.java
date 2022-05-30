package com.engeto.autobazar;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Jan Řezáč","Klofáčova 15, Brno",false,LocalDate.of(1995,10,23));
        VehicleOffer offer = new VehicleOffer();
        offer.addNewCar(new Vehicle("Škoda Fabia", 55000, true, client, 5.7));
        offer.addNewCar(new Vehicle("Ford Ka", 50000, true, client, 5.3));
        offer.printAllCars();
        offer.addNewCar(new Vehicle("Škoda Fabia", 55000, true, client, 5.7, VehicleType.CAR));
    }
}
