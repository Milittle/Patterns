package ChainOfResponsibility;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
