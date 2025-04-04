package com.echo.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    public List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.name());
            System.out.println("Item: " + item.packing().pack());
            System.out.println("Item: " + item.price());
        }
    }


}

