package com.echo.prototype;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/3/26 09:57
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: DemoTest
 * 文件描述: [
 *      设计模式：原型设计模式
 *      特性：重复创建对象且保证性能
 * ]
 * version：1.0
 *
 ********************************************************/
public class DemoTest {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape1 = ShapeCache.getShape("1");
        System.out.println(cloneShape1.getType());

        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println(cloneShape2.getType());

        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println(cloneShape3.getType());

    }

}
