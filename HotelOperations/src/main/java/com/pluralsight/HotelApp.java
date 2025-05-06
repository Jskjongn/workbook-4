package com.pluralsight;

public class HotelApp {

    public static void main(String[] args) {

        // testing room class
        Room room1 = new Room(2, 124.00, false, false);
        Room room2 = new Room(2, 124.00, true, false);
        Room room3 = new Room(1, 139.00, false, true);
        Room room4 = new Room(1, 139.00, true, true);

        // only room one is available because both occupied and dirty is false
        System.out.println("Is room one available: " + room1.isAvailable());
        System.out.println("Is room two available: " + room2.isAvailable());
        System.out.println("Is room three available: " + room3.isAvailable());
        System.out.println("Is room four available: " + room4.isAvailable());

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
        Employee employee1 = new Employee(1, "Mark", "Maintenance", 18.00, 35);
        Employee employee2 = new Employee(2, "Sam", "Maintenance", 18.00, 45);
        Employee employee3 = new Employee(3, "Alli", "Front Desk", 15.50, 35);
        Employee employee4 = new Employee(4, "Mariah", "Front Desk", 15.50, 45);

        // if worked 40 or fewer hours than regular pay rate, if worked over 40 hours then overtime pay
        System.out.println("\nEmployee one's total pay is: $" + employee1.getTotalPay());
        System.out.println("Employee two's total pay is: $" + employee2.getTotalPay());
        System.out.println("Employee three's total pay is: $" + employee3.getTotalPay());
        System.out.println("Employee four's total pay is: $" + employee4.getTotalPay());
    }

}
