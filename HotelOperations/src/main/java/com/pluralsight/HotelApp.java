package com.pluralsight;

public class HotelApp {

    public static void main(String[] args) {

        // testing room class
        Room room1 = new Room(2, 124.00, false, false);
        // Room room2 = new Room(2, 124.00, true, false);
        // Room room3 = new Room(1, 139.00, false, true);
        // Room room4 = new Room(1, 139.00, true, true);

        // room one is available because it is not occupied and not dirty
        System.out.println("Is room one available: " + room1.isAvailable());
        // when checking in sets room to occupied and to dirty
        room1.checkIn();
        // room no longer available
        System.out.println("Is room one available: " + room1.isAvailable());
        // when checked out room is not occupied but is still dirty
        room1.checkOut();
        // room still not available since it's still dirty
        System.out.println("Is room one available: " + room1.isAvailable() + ", Room must be cleaned!");
        // cleans room and is no longer dirty
        room1.cleanRoom();
        // room is available again
        System.out.println("Is room one available: " + room1.isAvailable());

        // testing reservation room
        Reservation reservation1 = new Reservation("king", 3, false);
        Reservation reservation2 = new Reservation("king", 3, true);
        Reservation reservation3 = new Reservation("double", 2, true);
        Reservation reservation4 = new Reservation("double", 2, false);

        // if it's a king its 139.00 a night, if it's a double its 124.00, and if it's the weekend then a 10% increase to the total
        System.out.println("\nThe price per night for a " + reservation1.getRoomType() + " is $" + reservation1.getPrice()
         + ", which brings your total to $" + reservation1.getReservationTotal() + " for " + reservation1.getNumberOfNights() + " nights");
        System.out.println("\nThe price per night for a " + reservation2.getRoomType() + " is $" + reservation2.getPrice()
                + ", which brings your total to $" + reservation2.getReservationTotal() + " for " + reservation2.getNumberOfNights() + " nights (at weekend rate)");
        System.out.println("\nThe price per night for a " + reservation3.getRoomType() + " is $" + reservation3.getPrice()
                + ", which brings your total to $" + reservation3.getReservationTotal() + " for " + reservation3.getNumberOfNights() + " nights (at weekend rate)");
        System.out.println("\nThe price per night for a " + reservation4.getRoomType() + " is $" + reservation4.getPrice()
                + ", which brings your total to $" + reservation4.getReservationTotal() + " for " + reservation4.getNumberOfNights() + " nights");

        // testing employee class
        // Employee employee1 = new Employee(1, "Mark", "Maintenance", 18.00, 35);
        // Employee employee2 = new Employee(2, "Sam", "Maintenance", 18.00, 45);
        // Employee employee3 = new Employee(3, "Alli", "Front Desk", 15.50, 35);
        Employee employee4 = new Employee(4, "Mariah", "Front Desk", 15.50, 0);

        // employee worked no hours so has no total pay
        System.out.println("\nEmployee four's total pay is: $" + employee4.getTotalPay());
        // punches in at 8 am
        employee4.punchIn(8.0);
        System.out.println("Employee four's day one hours: " + employee4.getHoursWorked());
        //punches out at 4 pm
        employee4.punchOut(16.0);
        // subtracts the punches and adds to hours worked
        System.out.println("Employee four's day one hours: " + employee4.getHoursWorked());
        System.out.println("Employee four's total pay is: $" + employee4.getTotalPay());
        // punches in at 8 am
        employee4.punchIn(8.0);
        //punches out at 4 pm
        employee4.punchOut(16.0);
        // subtracts the punches and adds to hours worked
        System.out.println("Employee four's day two hours: " + employee4.getHoursWorked());
        // employee now has hours worked so has a total pay
        System.out.println("Employee four's total pay is: $" + employee4.getTotalPay());


        // testing hotel class
        Hotel hotel1 = new Hotel("Ocean View", 10, 50);

        // displays availability
        System.out.println("Hotel: " + hotel1.getName());
        System.out.println("Available Suites: " + hotel1.getAvailableSuites());
        System.out.println("Available Basic Rooms: " + hotel1.getAvailableRooms());

        // try booking 3 suites
        boolean bookedSuites = hotel1.bookRoom(3, true);
        System.out.println("Booked 3 suites: " + bookedSuites);
        System.out.println("Available Suites after booking: " + hotel1.getAvailableSuites());

        // try booking 5 basic rooms
        boolean bookedRooms = hotel1.bookRoom(5, false);
        System.out.println("Booked 5 basic rooms: " + bookedRooms);
        System.out.println("Available Basic Rooms after booking: " + hotel1.getAvailableRooms());

        // try overbooking suites
        boolean overbook = hotel1.bookRoom(20, true);
        System.out.println("Tried booking 20 suites: " + overbook);
        System.out.println("Available Suites after failed booking: " + hotel1.getAvailableSuites());

        // try booking 0 suites
        boolean bookedNoSuites = hotel1.bookRoom(0, true);
        System.out.println("Booked 0 suites: " + bookedNoSuites);
        System.out.println("Available Suites after booking: " + hotel1.getAvailableSuites());

        // try booking 0 rooms
        boolean bookedNoRooms = hotel1.bookRoom(0, false);
        System.out.println("Booked 0 suites: " + bookedNoRooms);
        System.out.println("Available Basic Rooms after booking: " + hotel1.getAvailableRooms());
    }

}
