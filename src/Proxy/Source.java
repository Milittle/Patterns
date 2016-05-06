package Proxy;

/**
 * Created by mizeshuang on 2016/5/6.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method");
    }
}
