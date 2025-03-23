package com.echo.signleton;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/3/23 21:59
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: StaticInnerApp
 * 文件描述: [
 *      设计模式：单例设计模式
 *      静态内部类
 *      特性：双重校验锁一样的效果，但实现更简单
 *      线程：安全
 *      推荐使用
 * ]
 * version：1.0
 *
 ********************************************************/

// 1.当 StaticInnerApp 类被加载时
public class StaticInnerApp {

    private StaticInnerApp() {

    }

    // 2. 静态内部类 SingletonHolder 没有被加载进内存
    private static class SingletonHolder {
        private static final StaticInnerApp uniqueInstance = new StaticInnerApp();
    }

    // 3. 只有当调用 getUniqueInstance() 方法时，SingletonHolder() 才会被加载
    public static StaticInnerApp getUniqueInstance() {
        return SingletonHolder.uniqueInstance;
    }

}
