package com.ngocnv.Behavior.nullObject;

public interface Animal {
    Animal NULL_ANIMAL = new NullAnimal();

    void makeSound();

    final class NullAnimal implements Animal {
        @Override
        public void makeSound() {

        }
    }
}
