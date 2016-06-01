package Command;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class Invoker {
    private Command command;

    public Invoker(MyCommand command) {
        this.command = command;
    }
    public void action() {
        command.exe();
    }
}
