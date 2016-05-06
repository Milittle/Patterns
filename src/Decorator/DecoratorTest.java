package Decorator;

/**
 * Created by mizeshuang on 2016/5/6.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Sourceable sourceable1 = new Decorator(sourceable);
        sourceable1.method();
    }
}
