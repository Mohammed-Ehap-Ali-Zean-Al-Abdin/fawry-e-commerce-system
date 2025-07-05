public abstract class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract boolean isExpired();
    public boolean isAvailable(int requested) {
        return quantity >= requested && !isExpired();
    }
}

