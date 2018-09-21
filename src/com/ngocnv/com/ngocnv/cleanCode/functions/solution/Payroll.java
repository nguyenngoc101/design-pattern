package com.ngocnv.com.ngocnv.cleanCode.functions.solution;

public class Payroll {
    public static void main(String[] args) {
        IEmployee employee = new EmployeeFactory().makeEmployee(EmployeeType.COMMISSIONED);
        employee.calculatePay();
    }
}
