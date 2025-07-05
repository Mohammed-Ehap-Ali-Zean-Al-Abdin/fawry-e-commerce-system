public class ShippingItem {
    String name;
    double totalWeight;

    public ShippingItem(String name, double totalWeight) {
        this.name = name;
        this.totalWeight = totalWeight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return totalWeight;
    }
}
