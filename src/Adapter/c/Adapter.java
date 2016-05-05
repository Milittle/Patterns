package Adapter.c;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is method2");
    }
}
