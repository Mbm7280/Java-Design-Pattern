package com.echo.builder;

public class VegBuger extends Burger {
    @Override
    public String name() {
        return "Veg Buger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
