package com.ngocnv.cleanCode.functions.example1.solution;

public class Payroll {
    public static void main(String[] args) {
        IEmployee employee = new EmployeeFactory().makeEmployee(EmployeeType.COMMISSIONED);
        employee.calculatePay();
    }
}
