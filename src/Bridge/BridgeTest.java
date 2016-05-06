package Bridge;

/**
 * Created by mizeshuang on 2016/5/6.
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        Sourceable sourceable = new SourceSub1();
        bridge.setSourceable(sourceable);
        bridge.method();

        /*调用第二个对象*/
        Sourceable sourceable1 = new SourceSub2();
        bridge.setSourceable(sourceable1);
        bridge.method();
    }
}
