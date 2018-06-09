package com.ngocnv.structure.adapter;

public class BirdAdapter implements ToyDuck {

    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {

        // translate the methods appropriately
        bird.makeSound();
    }
}
