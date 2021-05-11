package restaurant;

import java.util.ArrayList;

public class MenuItem {


    private String dishName;
    private String category;
    private double price;
    private String description;
    private boolean newDish;

    public MenuItem(String dishName, String description, String category, double price, boolean newDish) {
        this.dishName = dishName;
        this.description = description;
        this.category = category;
        this.price = price;
        this.newDish = newDish;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setCategory(String category) {
        this.dishName = category;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setNewDish(String newDish) {
        this.dishName = newDish;
    }

    public String getDishName() {
        return dishName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean getNewDish() {
        return newDish;
    }

    public void output(){
        System.out.println(this.dishName + ":\n\t" + this.description + " is  a " + this.category + " for $" + this.price);
    }

}
