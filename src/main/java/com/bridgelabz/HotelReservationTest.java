package com.bridgelabz;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelReservationTest {


    @Test

    public void giveHotelName_ShouldReturnTrue() {
        HotelReservation hotel = new HotelReservation();
        hotel.addHotel();
        Assert.assertEquals(1,hotel.HotelReserve.size());

    }
}
