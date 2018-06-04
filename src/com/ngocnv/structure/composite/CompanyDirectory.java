package com.ngocnv.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements IEmployee {

    private List<IEmployee> employees = new ArrayList<>();

    public void add(IEmployee employee) {
        this.employees.add(employee);
    }

    public void remove(IEmployee employee) {
        this.employees.remove(employee);
    }

    @Override
    public void getInfo() {
        employees.stream().forEach(IEmployee::getInfo);
    }
}
