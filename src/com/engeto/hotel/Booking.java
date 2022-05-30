package com.engeto.hotel;

public class Booking {

//    Guest mainGuest;
//    List<Guest> otherGuests = new ArrayList<>();
//    Room room;
//    LocalDate begin;
//    LocalDate end;
//    TypeOfStay type;
//
//    public Booking(Guest mainGuest, Room room, LocalDate begin, LocalDate end, TypeOfStay type) {
//        this.mainGuest = mainGuest;
//        this.room = room;
//        this.begin = begin;
//        this.end = end;
//        this.type = type;
//    }
//    public Booking(Guest mainGuest, Room room) {
//        this(mainGuest, room, LocalDate.now(), LocalDate.now().plusDays(7), TypeOfStay.HOLIDAY);
//    }
//
//    public Guest getMainGuest() {
//        return mainGuest;
//    }
//
//    public void setMainGuest(Guest mainGuest) {
//        this.mainGuest = mainGuest;
//    }
//
//    public TypeOfStay getType() {
//        return type;
//    }
//
//    public void setType(TypeOfStay type) {
//        this.type = type;
//    }
//
//    public void addGuest(Guest newGuest) {
//        otherGuests.add(newGuest);
//    }
//    public void removeGuest(Guest guest) {
//        otherGuests.remove(guest);
//    }
//    public void clearOtherGuests() {
//        otherGuests.clear();
//    }
//
//    public Room getRoom() {
//        return room;
//    }
//
//    public void setRoom(Room room) {
//        this.room = room;
//    }
//
//    public LocalDate getBegin() {
//        return begin;
//    }
//
//    public void setBegin(LocalDate begin) {
//        this.begin = begin;
//    }
//
//    public LocalDate getEnd() {
//        return end;
//    }
//
//    public void setEnd(LocalDate end) {
//        this.end = end;
//    }
//
//    public String getDescription() {
//        StringBuilder result = new StringBuilder("Booking for "+mainGuest.getFullName()+" ("+type
//                +") from " + begin.toString() + " to " + end.toString() + " other guests: ");
//        for (Guest guest : otherGuests) {
//            result.append(guest.getFullName()).append(", ");
//        }
//        return result.toString();
//    }
}