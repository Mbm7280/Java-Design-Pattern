package com.echo.factory.simple;

public class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("The bird is eating.");
    }
}
