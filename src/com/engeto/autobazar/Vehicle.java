package com.engeto.autobazar;

public class Vehicle {

        String make;
        int price;
        boolean isAvailable;
        Client owner;
        double consuption;
        VehicleType vehicleType;

        public Vehicle(
                String make, int price, boolean isAvailable, Client owner,
                double consuption, VehicleType type ) {
                    this.make = make;
                    this.price = price;
                    this.isAvailable = isAvailable;
                    this.owner = owner;
                    this.consuption = consuption;
                    this.vehicleType = type;
        }

        public Vehicle(String make, int price, boolean isAvailable, Client owner, double consuption) {
            this.make = make;
            this.price = price;
            this.isAvailable = isAvailable;
            this.owner = owner;
            this.consuption = consuption;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        public Client getOwner() {
            return owner;
        }

        public void setOwner(Client owner) {
            this.owner = owner;
        }

        public double getConsuption() {
            return consuption;
        }

        public void setConsuption(double consuption) {
            this.consuption = consuption;
        }
    }