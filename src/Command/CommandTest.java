package Command;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class CommandTest {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new MyCommand(new Receiver()));
        invoker.action();
    }
}
