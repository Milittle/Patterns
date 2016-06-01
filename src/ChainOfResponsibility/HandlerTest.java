package ChainOfResponsibility;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class HandlerTest {
    public static void main(String[] args) {
        MyHandler myHandler1 = new MyHandler("h1");
        MyHandler myHandler2 = new MyHandler("h2");
        MyHandler myHandler3 = new MyHandler("h3");
        MyHandler myHandler4 = new MyHandler("h4");
        myHandler1.setHandler(myHandler4);
        myHandler4.setHandler(myHandler3);
        myHandler3.setHandler(myHandler2);

        myHandler1.operator();
    }
}
