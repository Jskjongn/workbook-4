package com.pluralsight;

public class Employee {

    // properties of an employee
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

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
        if (hoursWorked <= 40) {
            return hoursWorked;
        }
    }

    public double getOvertimeHours() {
        // if hours worked is greater than 40 it returns hours worked - 40
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
    }

    public double getTotalPay() {
        // regular hours * pay rate

        // overtime hours * 1.5 + regular hours * pay rate

    }
}
