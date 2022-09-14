package com.engeto.Hotel2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    Guest addingGuest;
    List<Guest> anotherGuest = new ArrayList<>();
    Room room;
    LocalDate startDate;
    LocalDate endDate;
    TypeOfCommorancy commType;

    public Booking(Guest addingGuest, Room room, LocalDate startDate, LocalDate endDate, TypeOfCommorancy commType) {
        this.addingGuest = addingGuest;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.commType = commType;
    }

    public Guest getAddingGuest() {
        return addingGuest;
    }

    public void setAddingGuest(Guest addingGuest) {
        this.addingGuest = addingGuest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public TypeOfCommorancy getCommType() {
        return commType;
    }

    public void setCommType(TypeOfCommorancy commType) {
        this.commType = commType;
    }

    public void addGuest(Guest addingGuest){
        anotherGuest.add(addingGuest);
    }
    public void summaryOfBooking() { }

// public String summaryOfBooking() {
//        return "Booking{" +
//                "addingGuest=" + addingGuest +
//                ", room=" + room +
//                ", startDate=" + startDate +
//                ", endDate=" + endDate +
//                ", commType=" + commType +
//                '}';
//    }

}
//        V rámci jedné rezervace (booking) vždy přiřazujeme pokoj jednomu nebo více hostům
//        na časové období mezi dvěma daty (například pokoj číslo 3 na období od 15. 7. do 24. 7. 2021).
//        Pobyt je buď pracovní, nebo rekreační.
