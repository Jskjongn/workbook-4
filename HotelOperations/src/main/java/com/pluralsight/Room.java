package com.pluralsight;

public class Room {

    // properties of a room
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // constructor
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    // derived getter
    public boolean isAvailable() {
        // if not occupied and not dirty then room is available
        return !this.occupied && !this.dirty;
    }
}
