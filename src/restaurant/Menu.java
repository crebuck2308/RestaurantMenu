package restaurant;

import java.text.SimpleDateFormat;
import java.util.*;

public class Menu {

    private ArrayList<MenuItem> menuItems;
    Scanner input;
    int index;
    MenuItem displayDish;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    //Add menu items to the menu:
    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    //Remove items from the menu:
    public void removeMenuItem(MenuItem menuItem){
        this.menuItems.remove(menuItem);
    }

    //Print out entire menu:
    public void displayMenu(){
        for(MenuItem item : menuItems){
            item.output();
        }
    }
    //Print one item from the menu
    public void displayItem(){
        input = new Scanner(System.in);
        System.out.println("Please enter the number of the dish you would like to eat: ");
        index = input.nextInt();
        input.close();
        displayDish = menuItems.get(index);

        System.out.println("You have selected " + displayDish.getDishName() + ". The " +
                displayDish.getDishName() + " is " + displayDish.getDescription() + " for only $"
                + displayDish.getPrice() + ".");
    }

     void getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        Date date = new Date();
        System.out.println(sdf.format(date));

    }



}

