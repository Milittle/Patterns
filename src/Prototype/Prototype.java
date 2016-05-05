package Prototype;

/**
 * Created by mizeshuang on 2016/5/5.
 */
public class Prototype implements Cloneable {
    public Object clone()throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}
