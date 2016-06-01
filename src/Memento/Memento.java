package Memento;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class Memento {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento(String value) {
        this.value = value;
    }
}
