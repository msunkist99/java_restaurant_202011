import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu("11/06/2020");
        menu.addMenuItem(7.99, "ultimate chocolate lover's cake", "dessert", "Chocolate Cake", true);
        menu.addMenuItem(8.99, "warm spicy dip and pita chips", "appetizer", "Artichoke Dip", true);
        menu.addMenuItem(10.99, "flat bread with ripe tomatoes, basil, and fresh mozzarella ", "flat bread pizza", "Margarita Flat Bread", true);
        menu.addMenuItem(9.99, "Featuring decadent ripe blackberry flavors with undertones of vanilla and toasted oak", "beverage", "Caymus Cabernet", true);
        menu.addMenuItem(15.99, "Beautifully marbled with fat, this roast is rich, juicy, and tender", "main course", "Prime Rib", true);

        Scanner input = new Scanner(System.in);
        System.out.println("Add new menu item");
        System.out.println("Enter menu item name");
        String name = input.nextLine();
        System.out.println("menu item description");
        String description = input.nextLine();
        System.out.println("menu item category");
        String category = input.nextLine();
        System.out.println("menu item price");
        Double price =input.nextDouble();

        menu.addMenuItem(price, description, category,name,true);

        System.out.println("Your Menu --");
        System.out.println(menu.toString());

        System.out.println("Enter id of menu item to delete");
        int index = input.nextInt();
        menu.toStringMenuItem(index);
        System.out.println("Menu item to remove - " + menu.toStringMenuItem(index));

        System.out.println("Updated Menu");
        System.out.println(menu.toString());
    }
}