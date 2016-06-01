package Observer;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class MySubject extends AbstractSubject{
    @Override
    public void opearation() {
        super.opearation();
        System.out.println("refresh myself");
        notifyAllObservers();
    }
}
