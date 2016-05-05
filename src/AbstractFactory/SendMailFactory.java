package AbstractFactory;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
