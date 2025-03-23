package com.echo.signleton;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/3/23 21:43
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: EagerApp
 * 文件描述: [
 *      设计模式：单例设计模式
 *      饿汉式
 *      特性：不需要加锁，执行效率提高。类加载时就会初始化，浪费内存
 *      线程：安全
 *      建议使用，如果需要 懒加载 则推荐使用 StaticInnerApp 中的静态内部类方式
 *
 * ]
 * version：1.0
 *
 ********************************************************/
public class EagerApp {

    private static EagerApp uniqueInstance = new EagerApp();

    private EagerApp() {
    }

    public static EagerApp getUniqueInstance() {
        return uniqueInstance;
    }

}
