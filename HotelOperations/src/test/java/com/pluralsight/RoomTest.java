package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_returnTrueIfOccupied() {
        // arrange
        Room room1 = new Room(2, 124.00, false, false);


        // act
        room1.checkIn();
        boolean success = room1.isOccupied();


        // assert
        assertTrue(success);
    }

    @Test
    public void checkIn_should_returnTrueIfDirty() {
        // arrange
        Room room1 = new Room(2, 124.00, false, false);


        // act
        room1.checkIn();
        boolean success = room1.isDirty();


        // assert
        assertTrue(success);
    }

    @Test
    public void checkOut_should_returnFalseIfOccupied() {
        // arrange
        Room room1 = new Room(2, 124.00, false, false);


        // act
        room1.checkIn();
        room1.checkOut();
        boolean success = room1.isOccupied();


        // assert
        assertFalse(success);
    }

    @Test
    public void checkOut_should_returnFalseIfDirty() {
        // arrange
        Room room1 = new Room(2, 124.00, false, false);


        // act
        room1.checkIn();
        room1.checkOut();
        boolean success = room1.isDirty();


        // assert
        assertFalse(success);
    }

    @Test
    public void cleanRoom_should_returnFalseIfDirty() {
        // arrange
        Room room1 = new Room(2, 124.00, false, false);


        // act
        room1.cleanRoom();
        boolean success = room1.isDirty();


        // assert
        assertFalse(success);
    }

}