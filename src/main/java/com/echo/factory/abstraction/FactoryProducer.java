package com.echo.factory.abstraction;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if (type.equals("animal")) {
            return new AnimalFactory();
        } else if (type.equals("fun")) {
            return new FunFactory();
        }
        return null;
    }
}
