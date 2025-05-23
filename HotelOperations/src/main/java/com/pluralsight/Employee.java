package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    // properties of an employee
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;

    // constructor
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // derived getters
    public double getRegularHours() {
        // if hours worked is less than or equal to 40 it returns hours worked
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        }
        return 40;
    }

    public double getOvertimeHours() {
        // if hours worked is greater than 40 it returns hours worked - 40
        if (this.hoursWorked > 40) {
            return this.hoursWorked - 40;
        }
        return 0;
    }

    public double getTotalPay() {
        // adds regular time to pay rate and if there's overtime it gets added to that
        return getRegularHours() * this.payRate + getOvertimeHours() * 1.5 * this.payRate;
    }

    public void punchIn(double time) {
        // takes in the punch in time
        this.punchInTime = time;
    }

    public void punchIn() {
        // gets current time
        LocalDateTime currentTime = LocalDateTime.now();
        // gets the hour and minute and converts minutes into a fraction
        double hour = currentTime.getHour();
        double minute = currentTime.getMinute() / 60.00;
        // combines them together
        double hours = hour + minute;
        // calls other punch in method and passes the time in
        punchIn(hours);
    }

    public void punchOut(double time) {
        // takes punch out time by subtracting the punch out time by the punch in time
        double punchOutTime = time - this.punchInTime;
        // adds the hours to hours worked
        this.hoursWorked += punchOutTime;
    }

    public void punchOut() {
        // gets current time
        LocalDateTime currentTime = LocalDateTime.now();
        // gets the hour and minute and converts minutes into a fraction
        double hour = currentTime.getHour();
        double minute = currentTime.getMinute() / 60.00;
        // combines them together
        double hours = hour + minute;
        // calls other punch in method and passes the time in
        punchOut(hours);
    }
}
