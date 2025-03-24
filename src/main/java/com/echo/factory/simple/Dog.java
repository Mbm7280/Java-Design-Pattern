package com.echo.factory.simple;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }
}
