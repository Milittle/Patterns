package AbstractFactory;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
