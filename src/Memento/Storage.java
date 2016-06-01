package Memento;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class Storage {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Storage(Memento memento) {
        this.memento = memento;
    }
}
