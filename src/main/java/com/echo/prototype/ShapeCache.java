package com.echo.prototype;

import java.util.HashMap;

public class ShapeCache {

    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put("1", circle);

        Retangle retangle = new Retangle();
        retangle.setId("2");
        shapeMap.put("2", retangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put("3", square);

    }

}
