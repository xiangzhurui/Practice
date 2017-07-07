package design.patterns.singleton;

/**
 * 延迟加载，饥汉式。线程安全
 * 由JVM的类加载机制保证延迟加载。由于该类没有任何静态变量进行初始化，所以初始化完成时，内部静态类LazyHolder并没有被初始化。
 * 由类的初始化机制保证线程安全。INSTANCE变量由内部静态类LazyHolde初始化时写入，而类初始化的实现为非并发，即线程安全。
 * Created by XiangZhuRui on 2017/7/7.
 */
public class Singleton4 {
    private Singleton4() {
    }

    private static class LazyHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
