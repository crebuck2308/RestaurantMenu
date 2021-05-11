package restaurant;

public class Testing {


    public static void main(String[] args){

        Menu mainMenu = new Menu();

        MenuItem myItem1 = new MenuItem("Surf and Turf", "Steak and lobster", "entre", 25.99, false);
        mainMenu.addMenuItem(myItem1);

        MenuItem myItem2 = new MenuItem("Scallops and Noods", "Scallops on a bed of linguine", "entre", 22.99, false);
        mainMenu.addMenuItem(myItem2);

        mainMenu.displayMenu();
    }
}
