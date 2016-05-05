package Adapter.o;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
