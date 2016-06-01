package Command;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void exe() {
        receiver.action();
    }
}
