package Builder;


import java.util.ArrayList;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        ArrayList<MailSender> list = (ArrayList) builder.produceMailSender(10);
        for (MailSender i : list) {
            i.send();
        }
    }
}
