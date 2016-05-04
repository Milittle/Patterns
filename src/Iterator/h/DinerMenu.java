package Iterator.h;

/**
 * Created by mizeshuang on 2016/5/4.
 */
public class DinerMenu {
    private static final int MAX_ITEMS=4;
    private int numberOfItems=0;
    MenuItem[] menuItems;
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("A", "菜A", true, 2.99);
        addItem("B", "菜B", true, 3.99);
        addItem("C", "菜C", true, 4.99);
        addItem("D", "菜D", true, 5.99);

    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("sorry,menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
