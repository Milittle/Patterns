package FactoryMethod;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("sms");
        sender.send();
    }
}
