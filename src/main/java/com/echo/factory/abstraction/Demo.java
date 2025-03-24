package com.echo.factory.abstraction;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/3/24 14:31
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: Demo
 * 文件描述: [ TODO ]
 * version：1.0
 *
 ********************************************************/
public class Demo {

    public static void main(String[] args) {
        AbstractFactory animalFactory = FactoryProducer.getFactory("animal");
        AbstractFactory funFactory = FactoryProducer.getFactory("fun");
        Animal dog = animalFactory.getAnimal("dog");
        dog.eat();
        Fun frisbee = funFactory.getFun("frisbee");
        frisbee.play();


    }

}
