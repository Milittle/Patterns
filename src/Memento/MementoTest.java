package Memento;

/**
 * Created by mizeshuang on 2016/6/1.
 */
public class MementoTest {
    public static void main(String[] args) {
        Original original = new Original("egg");
        Storage storage = new Storage(original.createMemento());

        original.setValue("change");
        System.out.println(original.getValue());


        original.restoreMemento(storage.getMemento());
        System.out.println(original.getValue());
    }
}
