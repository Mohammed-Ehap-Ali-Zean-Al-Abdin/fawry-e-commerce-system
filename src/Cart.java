import java.util.ArrayList;

public class Cart {
    ArrayList<CartItem> items = new ArrayList<>();
    public void clear() {
        items.clear();
    }
    public void add(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
