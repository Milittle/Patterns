package AbstractFactory;


/**
 * Created by mizeshuang on 2016/5/5.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender");
    }
}

