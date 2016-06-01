package Observer;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer1 was updated");
    }
}
