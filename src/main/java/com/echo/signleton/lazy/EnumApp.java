package com.echo.signleton.lazy;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/3/23 22:07
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: EnumApp
 * 文件描述: [
 *      设计模式：单例设计模式
 *      枚举
 *      特性：最简洁实现单例的一种方式、防止反射攻击、防止反序列化重新创建实例
 *      线程：安全
 *      推荐使用，特别是涉及反序列化创建对象时
 * ]
 * version：1.0
 *
 ********************************************************/
public enum EnumApp {

    INSTANCE;

    // 在此添加一些属性方法
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    // 测试
    public static void main(String[] args) {
        // 获取实例
        EnumApp instance = EnumApp.INSTANCE;

        // 使用实例方法
        instance.setData("Hello");
        System.out.println(instance.getData());

        // 再次获取实例
        EnumApp anotherInstance = EnumApp.INSTANCE;
        System.out.println(anotherInstance.getData());
    }


}
