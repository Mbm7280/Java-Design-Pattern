package com.echo.factory.abstraction;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }
}
