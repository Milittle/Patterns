package Iterator;

import java.util.Objects;

/**
 * Created by mizeshuang on 2016/5/4.
 */
public interface Iterator {
    public Object previous();
    public Object next();
    public boolean hasNext();
    public Object first();
}
