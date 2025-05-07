package com.pluralsight;

public class Hotel {

    // properties
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // constructor one to create number of suites and rooms available
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        // hotel starts off with no booked rooms
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // constructor two with all properties to set the number of booked rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    // other method
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        // if guest checked out 0 rooms then it would be false
        if (numberOfRooms > 0) {
            // if it is suite
            if (isSuite) {
                // if the number of suites is greater than number of rooms entered
                if (getAvailableSuites() >= numberOfRooms) {
                    // adds rooms entered to booked suites
                    this.bookedSuites += numberOfRooms;
                    // true when there is available rooms
                    return true;
                }
            } else {
                // if it is not suite then checks available rooms
                if (getAvailableRooms() >= numberOfRooms) {
                    // adds rooms entered to booked basic rooms
                    this.bookedBasicRooms += numberOfRooms;
                    // true when there is available rooms
                    return true;
                }
            }
        }
        // returns false if no rooms entered or there are no available rooms
        return false;
    }

    // derived getters
    public int getAvailableSuites() {
        // gets available number of suites by subtracting by the booked number
        return this.numberOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms() {
        // gets available number of basic rooms by subtracting by the booked number
        return this.numberOfRooms - this.bookedBasicRooms;
    }
}
