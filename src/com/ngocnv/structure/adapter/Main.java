package com.ngocnv.structure.adapter;

public class Main {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        PlasticToyDuck plasticToyDuck = new PlasticToyDuck();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("Toy Duck...");
        plasticToyDuck.squeak();

        System.out.println("Bird Adapter...");
        birdAdapter.squeak();

    }
}
