import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private String lastUpdated;

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
}
