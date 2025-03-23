package com.echo.signleton;

/****************************************************
 * 创建人：Echo
 * 创建时间: 2025/3/23 21:20
 * 项目名称: {Java-Design-Pattern}
 * 文件名称: LazyApp
 * 文件描述: [
 *      设计模式：单例设计模式
 *      懒汉式（lazily initialized）
 *      特性：私有静态变量 uniqueInstance 被延迟实例化，如果没有用到该类，那么就不会实例化 uniqueInstance，从而节约资源。
 *      线程：不安全
 *      不建议使用
 *
 * ]
 * version：1.0
 *
 ********************************************************/
public class LazyApp {

    private static LazyApp uniqueInstance;

    public LazyApp() {
    }


    /**
     * 线程不安全
     *
     * @return LazyApp
     */
    public static LazyApp getInstance() {
        // 如果多个线程能够同时进入，并且此时 uniqueInstance 为 null，那么会有多个线程执行 uniqueInstance = new LazyApp();
        // 导致实例化多次 uniqueInstance
        if (uniqueInstance == null) {
            uniqueInstance = new LazyApp();
        }
        return uniqueInstance;
    }

    /**
     * 线程安全
     * 对方法进行加锁操作，确保在一个时间点只能有一个线程能够进入该方法，从而避免了实例化多次 uniqueInstance。
     *
     * @return LazyApp
     */
    public static synchronized LazyApp getSafetyInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazyApp();
        }
        return uniqueInstance;
    }


}
