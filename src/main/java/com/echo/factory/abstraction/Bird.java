package com.echo.factory.abstraction;

public class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("The bird is eating");
    }
}
