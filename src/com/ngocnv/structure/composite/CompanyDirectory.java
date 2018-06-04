package com.ngocnv.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

    private List<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    public void remove(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public void getInfo() {
        employees.stream().forEach(Employee::getInfo);
    }
}
