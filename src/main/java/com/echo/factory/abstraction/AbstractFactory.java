package com.echo.factory.abstraction;

public abstract class AbstractFactory {
    abstract Animal getAnimal(String animalName);

    abstract Fun getFun(String funName);
}
