package com.echo.builder;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/3/25 21:42
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: DemoTest
 * 文件描述: [
 *      设计模式：建造者设计模式
 *      特性：使用多个简单对象构建出一个复杂对象
 * ]
 * version：1.0
 *
 ********************************************************/
public class DemoTest {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("vegMeal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());


        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("nonVegMeal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());

    }

}
