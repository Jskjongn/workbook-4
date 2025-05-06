package com.pluralsight;

public class Reservation {

    // properties of a reservation
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    // constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    // getters and setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    // derived getters
    public double getPrice() {
        // if it's a king bed
        if (roomType.equalsIgnoreCase("king")){
            return 139.00;
        }
        // if it's a double bed
        return 124.00;
    }

    public double getReservationTotal() {
        // if it's the weekend then gets 10% increase
        if (isWeekend){
            return getNumberOfNights() * (getPrice() * 1.10);
        }
        // if it's weekdays no increase
        return getNumberOfNights() * getPrice();
    }
}
