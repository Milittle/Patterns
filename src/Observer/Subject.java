package Observer;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public interface Subject {
    public void addObserver(Observer observer);

    public void delObserver(Observer observer);

    public void notifyAllObservers();

    public void opearation();
}
