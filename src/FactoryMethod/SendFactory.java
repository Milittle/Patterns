package FactoryMethod;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class SendFactory {

    /*普通的工厂方法*/
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        }else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("please input correct type!");
            return null;
        }
    }

    /*多个工厂方法*/
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

    /*也可以静态工厂方法*/
}
