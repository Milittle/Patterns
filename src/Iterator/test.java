package Iterator;

/**
 * Created by mizeshuang on 2016/5/4.
 */
public class test {
    public static void main(String[] args) {
        Collection collection=new MyCollection();
        Iterator iterator=collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
