package com.echo.factory.abstraction;

public class AnimalFactory extends AbstractFactory {
    @Override
    Animal getAnimal(String animalName) {
        if (animalName == null) {
            return null;
        } else if (animalName.equals("dog")) {
            return new Dog();
        } else if (animalName.equals("cat")) {
            return new Cat();
        } else if (animalName.equals("bird")) {
            return new Bird();
        }
        return null;
    }

    @Override
    Fun getFun(String funName) {
        return null;
    }
}
