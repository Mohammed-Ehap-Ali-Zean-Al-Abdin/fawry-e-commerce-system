import java.util.ArrayList;

public class CheckoutService {
    public static void checkout(Customer customer) {
        if (customer.cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double subtotal = 0;
        ArrayList<ShippingItem> toShip = new ArrayList<>();
        for (CartItem item : customer.cart.items) {
            Product p = item.product;
            if (!p.isAvailable(item.quantity)) {
                System.out.println("Error: Product unavailable or expired: " + p.name);
                customer.cart.clear();
                return;
            }
            subtotal += p.price * item.quantity;
            p.quantity -= item.quantity;
            if (p instanceof Shippable) {
                double totalWeight = ((Shippable) p).getWeight() * item.quantity;
                toShip.add(new ShippingItem(item.quantity +"x " + p.name , totalWeight));
            }
        }

        double shipping = toShip.isEmpty() ? 0 : 30;
        double total = subtotal + shipping;

        if (customer.balance < total) {
            System.out.println("Insufficient balance.");
            customer.cart.clear();
            return;
        }

        customer.balance -= total;
        if (!toShip.isEmpty()) ShippingService.ship(toShip);
        customer.cart.clear();

        System.out.println("** Checkout receipt **");
        for (CartItem item : customer.cart.items) {
            System.out.printf("%dx %s\t%.0f\n", item.quantity, item.product.name, item.product.price * item.quantity);
        }
        System.out.println("----------------------");
        System.out.printf("Subtotal\t%.0f\n", subtotal);
        System.out.printf("Shipping\t%.0f\n", shipping);
        System.out.printf("Amount\t%.0f\n", total);
        System.out.printf("Balance after\t%.0f\n", customer.balance);
    }
}

