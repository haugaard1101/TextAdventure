package textAdventure;

public class Item {
    private String itemName;
    private String itemDescription;

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    Item(String name, String description) {
        this.itemName = name;
        this.itemDescription = description;
    }

    @Override
    public String toString() {
        return itemName + itemDescription;
    }
}
