package com.echo.factory.abstraction;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }
}
