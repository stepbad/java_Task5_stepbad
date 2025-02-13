public class PurchaseApplication {
    public static void main(String[] args) {
        WeighedItem bananas = new WeighedItem("Bananas", 2.75, 1.8);
        System.out.println(bananas);

        CountedItem notebooks = new CountedItem("Notebooks", 5.25, 3);
        System.out.println(notebooks);
    }
}