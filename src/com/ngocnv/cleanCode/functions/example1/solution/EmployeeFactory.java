package com.ngocnv.cleanCode.functions.example1.solution;

public class EmployeeFactory implements IEmployeeFactory {

    @Override
    public IEmployee makeEmployee(EmployeeType employeeType) {
        switch (employeeType) {
            case COMMISSIONED:
                return new CommissionedEmployee();
            case HOURLY:
                return new HourlyEmployee();
            case SALARIED:
                return new SalariedEmployee();
            default:
                throw new IllegalArgumentException("Wrong employee type!");
        }
    }
}
