package Iterator.h;

import java.util.ArrayList;

/**
 * Created by mizeshuang on 2016/5/4.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;
    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem)items.get(position);
        position += 1;
        return menuItem;
    }
}
