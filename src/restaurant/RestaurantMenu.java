package restaurant;


public class RestaurantMenu {
    public static void main(String[] args){

        Menu mainMenu = new Menu();
        //Create Several items and add them to a menu:
        MenuItem myItem1 = new MenuItem("appetizer", "Toasted Ravioli", "The BEST toasted ravs in town!", 8.99);
        mainMenu.addMenuItem(myItem1);

        MenuItem myItem2 = new MenuItem("appetizer", "Garlic Bread", "Homemade bread toasted with chef's secret garlic spread.", 5.99);
        mainMenu.addMenuItem(myItem2);

        MenuItem myItem3 = new MenuItem("entre", "Italian Beef Sandwich", "The best Italian beef sandwich EVER!", 12.99, "new");
        mainMenu.addMenuItem(myItem3);

        MenuItem myItem4 = new MenuItem("entre", "Surf and Turf", "Filet cooked to your liking with a succulent Maine lobster tail with your choice of side.", 29.99);
        mainMenu.addMenuItem(myItem4);

        MenuItem myItem5 = new MenuItem("entre", "Shrimp Linguine", "Gulf shrimp on a bed of homemade pasta linguine in a garlic butter sauce.", 19.99, "new");
        mainMenu.addMenuItem(myItem5);

        MenuItem myItem6 = new MenuItem("dessert", "Tiramisu", "Delightful tiramisu for dessert", 6.99);
        mainMenu.addMenuItem(myItem6);
//        MenuItem myItem7= new MenuItem("dessert", "Tiramisu", "Delightful tiramisu for dessert", 6.99);
//        mainMenu.addMenuItem(myItem7);

        //Prompt user to create a new item and add to the menu
        MenuItem userItem = new MenuItem();
        MenuItem newMenuItem = userItem.createNewItem();
        //how to keep making new items??


        //Checking to make sure duplicate items are not added.

        mainMenu.addMenuItem(newMenuItem);
        //Print the entire, updated menu to the screen:
        mainMenu.displayMenu();
        System.out.println("\nThe menu was last updated on: ");
        mainMenu.getDate();
        //Print and individual menu item to the screen:
//        mainMenu.displayItem();

        //delete an item from a menu, then reprint the menu:
//        mainMenu.removeMenuItem(myItem7);
//        mainMenu.displayMenu();


    }
}