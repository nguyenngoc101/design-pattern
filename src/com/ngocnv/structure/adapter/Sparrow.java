package com.ngocnv.structure.adapter;

public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chip Chip");
    }
}
