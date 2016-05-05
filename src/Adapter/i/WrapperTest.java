package Adapter.i;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class WrapperTest {
    public static void main(String[] args) {
        Sourceable sourceable1 = new SourceSub1();
        Sourceable sourceable2 = new SourceSub2();

        sourceable1.method1();
        sourceable1.method2();

        sourceable2.method1();
        sourceable2.method2();
    }
}
