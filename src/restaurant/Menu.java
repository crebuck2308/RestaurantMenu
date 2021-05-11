package restaurant;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<MenuItem>();
    }

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public void displayMenu(){
        for(MenuItem item : menuItems){
            item.output();
        }
    }
}
