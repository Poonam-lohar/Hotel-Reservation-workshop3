package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class HotelReservation {

    Map<String, Hotel> HotelReserve = new HashMap<>();

    public void addHotel() {
        Hotel hotel = new Hotel("Lackwood", 100);
        HotelReserve.put(hotel.getHotelName(),hotel);
    }


    public static void main(String[] args) {

        System.out.println("Welcome To Hotel Reservation Program.....");
        HotelReservation hotel = new HotelReservation();
        hotel.addHotel();

    }
}
