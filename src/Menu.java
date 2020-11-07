import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private String lastUpdated;

    //constructor
    public Menu(String lastUpdated) {
        menuItems = new ArrayList<>();
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> aMenuItems) {
        menuItems = aMenuItems;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String aLastUpdated) {
        lastUpdated = aLastUpdated;
    }

    public void addMenuItem(Double price,
                            String description,
                            String category,
                            String name,
                            Boolean newItem){

        MenuItem newMenuItem = new MenuItem(
                price,
                description,
                category,
                name,
                newItem);

        menuItems.add(newMenuItem);
    }

    public void removeMenuItem(int menuItemId) {
        for (int i = 0 ; i < menuItems.size() ; i++) {
            if (menuItems.get(i).getMenuItemId() == menuItemId) {
                menuItems.remove(i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                //"menuItems=" + menuItems +
                ", lastUpdated='" + lastUpdated + "\'\n" +
                ", menuItems='\n" + menuItems.toString() +
                '}';
    }

    public String toStringMenuItem(int index) {
        return menuItems.get(index).toString();
    }
}
