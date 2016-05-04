package Iterator.h;

import java.util.ArrayList;

/**
 * Created by mizeshuang on 2016/5/4.
 */
public class PancakeHouseMenu {
    ArrayList menuItems;
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("E", "菜E", true, 2.99);
        addItem("F", "菜F", true, 3.99);
        addItem("G", "菜G", true, 4.99);
        addItem("H", "菜H", true, 5.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
