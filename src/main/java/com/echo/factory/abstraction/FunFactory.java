package com.echo.factory.abstraction;

public class FunFactory extends AbstractFactory {
    @Override
    Animal getAnimal(String animalName) {
        return null;
    }

    @Override
    Fun getFun(String funName) {
        if (funName == null) {
            return null;
        } else if (funName.equals("doll")) {
            return new Doll();
        } else if (funName.equals("frisbee")) {
            return new Frisbee();
        } else if (funName.equals("bug")) {
            return new Bug();
        }
        return null;
    }
}
