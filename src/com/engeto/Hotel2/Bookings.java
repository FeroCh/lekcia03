package com.engeto.Hotel2;

import com.engeto.Computer;

import java.util.ArrayList;
import java.util.List;

public class Bookings {
    List<Booking> bookings = new ArrayList<>();

    public void addBookings(Booking newBooking){
        bookings.add(newBooking);
    }

    public void printBookings(){
        for (Booking booking : bookings) {
            booking.summaryOfBooking();
            }

    }
}
//        Chceme také mít k dispozici třídu, která bude uchovávat všechny rezervace
//        (například list of bookings), které jsme v systému vytvořili a bude mít metodu,
//        která vypíše informace o všech rezervacích.
