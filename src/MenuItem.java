import java.util.Objects;

public class MenuItem {

    private Double price;
    private String description;
    private String category;
    private String name;
    private Boolean newItem;
    private int menuItemId;

    private static int nextMenuItemId = 0;

    //constructor
    public MenuItem(Double price,
                    String description,
                    String category,
                    String name,
                    Boolean newItem) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.name = name;
        this.newItem = newItem;
        this.menuItemId = nextMenuItemId++;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double aPrice) {
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public Boolean getNewItem() {
        return newItem;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setNewItem(Boolean aNewItem) {
        newItem = aNewItem;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", newItem=" + newItem +
                ", menuItemId=" + menuItemId +
                "}\n" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return menuItemId == menuItem.menuItemId &&
                Objects.equals(price, menuItem.price) &&
                Objects.equals(description, menuItem.description) &&
                Objects.equals(category, menuItem.category) &&
                Objects.equals(name, menuItem.name) &&
                Objects.equals(newItem, menuItem.newItem);
    }
}

