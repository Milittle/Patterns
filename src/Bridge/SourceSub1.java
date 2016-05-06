package Bridge;

/**
 * Created by mizeshuang on 2016/5/6.
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the first sub");
    }
}
