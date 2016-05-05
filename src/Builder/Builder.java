package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mizeshuang on 2016/5/5.
 */
/*工厂方法是构造一个对象给调用工厂方法的对象返回去一个对象，而生成器是构造一个集合给调用它的对象*/
public class Builder {
    private ArrayList<Sender> list = new ArrayList<Sender>();

    public List<Sender> produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
        return list;
    }

    public List<Sender> produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
        return list;
    }
}
