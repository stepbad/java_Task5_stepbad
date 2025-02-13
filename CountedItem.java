public class CountedItem extends PurchaseItem {
    private int quantity; // Number of items

    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    public double getPrice() {
        return super.getPrice() * quantity;
    }

    public String toString() {
        return super.toString() + " " + quantity + " units @ $" + String.format("%.2f", getPrice());
    }
}
