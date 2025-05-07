package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchIn_should_startEmployeePunchInTime(){
        // arrange
        Employee employee1 = new Employee(4, "Mariah", "Front Desk", 15.50, 0);

        // act
        employee1.punchIn(8.00);

        // assert
        assertEquals(0, employee1.getHoursWorked());
    }

    @Test
    public void punchOut_should_calculateNumberOfHoursWorked(){
        // arrange
        Employee employee1 = new Employee(4, "Mariah", "Front Desk", 15.50, 0);

        // act
        employee1.punchIn(8.00);
        employee1.punchOut(16.00);

        // assert
        assertEquals(8, employee1.getHoursWorked());
    }

}