package Proxy;

/**
 * Created by mizeshuang on 2016/5/6.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
