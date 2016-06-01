package Observer;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.addObserver(new Observer1());
        subject.addObserver(new Observer2());
        subject.opearation();
    }
}
