package Iterator.h;

import java.util.ArrayList;

/**
 * Created by mizeshuang on 2016/5/4.
 */
public class Alice {
    public void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }
        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] menuItems = dinerMenu.getMenuItems();
        for (int i = 0; i < menuItems.length; i++) {
            MenuItem menuItem = menuItems[i];
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }
        //如果再添加一个菜单的话，那么就要再写一个循环，来显示这些菜单的信息
    }

    public void printBreakfastMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }
    }

    public void printLunchMenu() {
        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] menuItems = dinerMenu.getMenuItems();
        for (int i = 0; i < menuItems.length; i++) {
            MenuItem menuItem = (MenuItem) menuItems[i];
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
        }
    }

    public void printVegetarianMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            if(isItemVegetarian(menuItem)) {
                System.out.println(menuItem.getName());
                System.out.println(menuItem.getDescription());
                System.out.println(menuItem.getPrice());
            }
        }
        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] menuItems = dinerMenu.getMenuItems();
        for (int i = 0; i < menuItems.length; i++) {
            MenuItem menuItem = (MenuItem) menuItems[i];
            if(isItemVegetarian(menuItem)) {
                System.out.println(menuItem.getName());
                System.out.println(menuItem.getDescription());
                System.out.println(menuItem.getPrice());
            }
        }
    }

    public boolean isItemVegetarian(MenuItem menuItem) {
        return menuItem.isVegetarian();
    }
}
