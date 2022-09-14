package com.engeto.Hotel2;

public class Room {
    int roomId;
    int numberOfBeds;
    boolean isBalcony;
    boolean isSeaview;
    double nightlyPrice;

    public Room(int roomId, int numberOfBeds, boolean isBalcony, boolean isSeaview, double nightlyPrice) {
        this.roomId = roomId;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isSeaview = isSeaview;
        this.nightlyPrice = nightlyPrice;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isSeaview() {
        return isSeaview;
    }

    public void setSeaview(boolean seaview) {
        isSeaview = seaview;
    }

    public double getNightlyPrice() {
        return nightlyPrice;
    }

    public void setNightlyPrice(double nightlyPrice) {
        this.nightlyPrice = nightlyPrice;
    }

    public String roomDescription(){
        return  "pokoj číslo: "+roomId+" je "+numberOfBeds+" lůžkovy"+"za cenu "+nightlyPrice+" Kč/noc";
    }

}
