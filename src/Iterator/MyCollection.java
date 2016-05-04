package Iterator;

/**
 * Created by mizeshuang on 2016/5/4.
 */
public class MyCollection implements Collection {
    public String string[]={"A","B","C","D","E"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
