import java.util.ArrayList;

public class ShippingService {
    public static void ship(ArrayList<ShippingItem> items) {
        double totalWeight = 0;
        System.out.println("** Shipment notice **");
        for (ShippingItem item : items) {
            System.out.printf("%s %.0fg\n", item.getName(), item.getWeight());
            totalWeight += item.getWeight();
        }
        System.out.printf("Total package weight %.1fkg\n\n", totalWeight / 1000);
    }
}
