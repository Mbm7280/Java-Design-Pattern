package com.echo.builder;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bolttle();
    }

    @Override
    public abstract float price();

}
