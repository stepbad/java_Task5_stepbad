public class PurchaseItem {
    private String name;
    private double unitPrice;

    public PurchaseItem() {
        this("no item", 0.0);
    }

    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public double getPrice() {
        return unitPrice;
    }

    public String toString() {
        return name + " @ $" + String.format("%.2f", unitPrice);
    }
}
