package com.echo.prototype;

public class Retangle extends Shape {
    public Retangle() {
        type = "Retangle";
    }

    @Override
    public void draw() {
        System.out.println("draw Retangle");
    }

}
