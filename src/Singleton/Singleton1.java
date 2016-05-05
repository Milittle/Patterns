package Singleton;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class Singleton1 {

    private static class SingletonFactory {
        private static Singleton1 singleton = new Singleton1();
    }
    public Singleton1 getSingleton() {
        return SingletonFactory.singleton;
    }

    public Object readReslove() {
        return getSingleton();
    }
}
