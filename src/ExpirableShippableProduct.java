import java.util.Date;

public class ExpirableShippableProduct extends ExpirableProduct implements Shippable {
    double weight;

    public ExpirableShippableProduct(String name, double price, int quantity, Date expiryDate, double weight) {
        super(name, price, quantity, expiryDate);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
