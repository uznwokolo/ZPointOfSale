public class Item {

    private String itemName;
    private int quantity;
    private String serialNumber;
    private ItemType type;

    public Item(){ }

    public Item(String name, int qty, String serial, ItemType itype)
    {
        this.itemName = name;
        this.quantity = qty;
        this.serialNumber = serial;
        this.type = itype;
    }

    @Override
    public String toString() {
        return "Item{ " +
                "itemName: '" + itemName + '\'' +
                ", quantity: " + quantity +
                ", serialNumber: '" + serialNumber + '\'' +
                ", type: " + type + " }";
    }

    // Default getters and setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
}
