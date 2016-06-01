package Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class AbstractSubject implements Subject {
    private Vector<Observer> observers = new Vector<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        Enumeration<Observer> enumeration = observers.elements();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement().update();
        }
    }

    @Override
    public void opearation() {

    }
}
