package AbstractFactory;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
