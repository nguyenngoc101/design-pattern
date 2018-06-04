package com.ngocnv.structure.composite;

public class Manager implements Employee {

    private String id;
    private String name;
    private String position;

    public Manager(String id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }


    @Override
    public void getInfo() {
        System.out.println("EmployeeId: " + id + " name: " + name + " position: "+position);
    }
}
