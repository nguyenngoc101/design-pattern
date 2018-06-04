package com.ngocnv.structure.composite;

public class Company {
    public static void main(String[] args) {
        Developer dev1 = new Developer("100", "Ngoc", "Developer");
        Developer dev2 = new Developer("101", "Vu", "Senior Developer");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.add(dev1);
        engDirectory.add(dev2);

        Manager man1 = new Manager("200", "Tan", "GL Leader");
        Manager man2 = new Manager("201", "Son ", "Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.add(man1);
        accDirectory.add(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.add(engDirectory);
        directory.add(accDirectory);
        directory.getInfo();
    }
}
