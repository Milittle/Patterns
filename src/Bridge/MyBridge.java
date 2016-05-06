package Bridge;

/**
 * Created by mizeshuang on 2016/5/6.
 */
public class MyBridge extends Bridge {
    public void method() {
        getSourceable().method();
    }
}
