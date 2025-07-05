import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class FawryEcommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> allProducts = new ArrayList<>();

        // Sample products (you can modify)
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 2);
        allProducts.add(new ExpirableShippableProduct("Cheese", 100, 10, c.getTime(), 200));
        allProducts.add(new ExpirableShippableProduct("Biscuits", 150, 5, c.getTime(), 700));
        allProducts.add(new ShippableProduct("TV", 3000, 3, 5000));
        allProducts.add(new NormalProduct("Scratch Card", 50, 20));

        Customer customer = new Customer("Mohamed", 1000);

        while (true) {
            System.out.println("Options:");
            System.out.println("1. View Products\n2. Add to Cart\n3. Checkout\n4. Exit\n");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("All Products:");
                int i = 1;
                for (Product p : allProducts) {
                    System.out.printf("%d. %s (%.0f EGP) - %d available\n", i++, p.name, p.price, p.quantity);
                }
            } else if (choice == 2) {
                System.out.print("Enter product number: ");
                int index = sc.nextInt() - 1;
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                if (index >= 0 && index < allProducts.size())
                    customer.cart.add(allProducts.get(index), qty);
            } else if (choice == 3) {
                CheckoutService.checkout(customer);
            } else break;
        }
    }
}