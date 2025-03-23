package com.echo.signleton;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/3/23 21:49
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: DoubleCheckApp
 * 文件描述: [
 *      设计模式：单例设计模式
 *      双重校验锁
 *      特性：采用双锁机制，线程安全且在多线程情况下保证高性能
 *      线程：安全
 *      推荐使用
 *
 * ]
 * version：1.0
 *
 ********************************************************/
public class DoubleCheckApp {

    // volatile 确保多线程情况下Jvm不会出现指令重排
    private volatile static DoubleCheckApp uniqueInstance;

    private DoubleCheckApp() {
    }

    public static DoubleCheckApp getUniqueInstance() {
        // 先判断 uniqueInstance 是否已经被实例化
        if (uniqueInstance == null) {
            // 未被实例化时，对实例化语句进行加锁
            synchronized (DoubleCheckApp.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckApp();
                }
            }
        }
        return uniqueInstance;
    }


}
