package restaurant;

import java.util.Objects;
import java.util.Scanner;

public class MenuItem {

    private String category;
    private String dishName;
    private String description;
    private double price;
    private String newDish;

    Scanner scanner = new Scanner(System.in);

    public MenuItem(String category, String dishName, String description, double price, String newDish) {
        this.category = category;
        this.dishName = dishName;
        this.description = description;
        this.price = price;
        this.newDish = newDish;
    }
    public MenuItem(String category, String dishName, String description, double price) {
        this.category = category;
        this.dishName = dishName;
        this.description = description;
        this.price = price;
        this.newDish = "a classic";
    }
    public MenuItem(){

    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public String getDishName() {
        return dishName;
    }
    public void setDishName(String aDishName) {
        dishName = aDishName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription){
        description = aDescription;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double aPrice){
        price = aPrice;
    }

    public String getNewDish() {
        return newDish;
    }
    public void setNewDish(String aNewDish) {
        newDish = aNewDish;
    }

    public void output(){
        System.out.println(this.dishName + ":\n\t" + this.description + " is  a " + this.category
                + " for $" + this.price + ".\n\tThis item is " + this.newDish + ".");
    }

    //Ask user to input a new Menu item
    public MenuItem createNewItem(){
        String input;
        //keeping the do-while statement to allow user to create multiple items to add to the menu.
        //Just nee do figure out how to do so.
        do{
            System.out.println("If you would like to create a new menu item enter a number 1-4:");
            System.out.println("Enter 1 to create a new appetizer item:");
            System.out.println("Enter 2 to create a new entre item:");
            System.out.println("Enter 3 to create a new dessert item: ");
            System.out.println("Enter 4 to exit");

            String aCategory = "";
            input = scanner.nextLine();
            if (input.equals("1")){
                aCategory = "appetizer";
            }else if (input.equals("2")){
                aCategory = "entre" ;
            }else if (input.equals("3")){
                aCategory = "dessert";
            }
            setCategory(aCategory);

            System.out.println("Please enter the name of your new dish: ");
            String aDishName = scanner.nextLine();
                setDishName(aDishName);

            System.out.println("Please enter a description for the new dish: ");
            String aDescription = scanner.nextLine();
                setDescription(aDescription);

            System.out.println("Please enter the price for the new dish: ");
            double aPrice = scanner.nextDouble();
                setPrice(aPrice);

            String aNewDish = "new";
                setNewDish(aNewDish);

            return new MenuItem(category, dishName, description, price, newDish);
        }while (!input.equals("4"));

    }

    @Override
    public boolean equals(Object dish) {
        if (this == dish)
            return true;
        if (!(dish instanceof MenuItem))
            return false;
        MenuItem menuItem = (MenuItem) dish;
        return Objects.equals(getDishName(), menuItem.getDishName()) && Objects.equals(getDescription(), menuItem.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDishName(), getDescription());
    }
//
//    public void duplicateItem(){
//
//    }
}
