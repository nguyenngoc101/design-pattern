package com.ngocnv.Behavior.nullObject;

public class Main {

    public static void main(String[] args) {

        String animalType = "Unknown";
        Animal animal;

        if (animalType.equals("Dog")) {
            animal = new Dog();
        } else {
            animal = Animal.NULL_ANIMAL;
        }

        animal.makeSound();
    }
}
