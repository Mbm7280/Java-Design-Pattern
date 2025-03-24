package com.echo.factory.simple;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/3/24 13:20
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: AnimalFactory
 * 文件描述: [
 *      设计模式：工程设计模式
 *      简单工厂
 *      特性：提供了创建对象的一种方式，适用于复杂对象创建
 * ]
 * version：1.0
 *
 ********************************************************/
public class AnimalFactory {

    public Animal getAnimal(String animalType) {
        if (animalType == null) {
            return null;
        }
        if (animalType.equals("cat")) {
            return new Cat();
        } else if (animalType.equals("dog")) {
            return new Dog();
        } else if (animalType.equals("bird")) {
            return new Bird();
        }
        return null;
    }

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal cat = animalFactory.getAnimal("cat");
        cat.eat();

        Animal dog = animalFactory.getAnimal("dog");
        dog.eat();

        Animal bird = animalFactory.getAnimal("bird");
        bird.eat();
    }

}
