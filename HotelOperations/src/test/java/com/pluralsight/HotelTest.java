package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void bookRoom_should_increaseBookedSuites(){
        // arrange
        Hotel hotel = new Hotel("Omni Fort Worth Hotel", 10, 50);


        // act
        hotel.bookRoom(3, true);


        // assert
        assertEquals(7, hotel.getAvailableSuites());
    }

    @Test
    public void bookRoom_should_increaseBookedBasicRooms(){
        // arrange
        Hotel hotel = new Hotel("Omni Fort Worth Hotel", 10, 50);


        // act
        hotel.bookRoom(3, false);


        // assert
        assertEquals(47, hotel.getAvailableRooms());
    }

    @Test
    public void bookRoom_should_returnFalseIfNoSuitesAvailable(){
        // arrange
        Hotel hotel = new Hotel("Omni Fort Worth Hotel", 10, 50);


        // act
        boolean success = hotel.bookRoom(11, true);


        // assert
        assertFalse(success);
    }

    @Test
    public void bookRoom_should_returnFalseIfNoRoomsEntered(){
        // arrange
        Hotel hotel = new Hotel("Omni Fort Worth Hotel", 10, 50);


        // act
        boolean success = hotel.bookRoom(0, true);


        // assert
        assertFalse(success);
    }

    @Test
    public void getName_should_returnHotelsName(){
        // arrange
        Hotel hotel = new Hotel("Omni Fort Worth Hotel", 10, 50);


        // act
        String hotelName = hotel.getName();


        // assert
        assertEquals("Omni Fort Worth Hotel", hotelName);
    }
}