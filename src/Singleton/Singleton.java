package Singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {

    }

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public Object readResolve() {
        return singleton;
    }
}
