# 🛒 Java E-Commerce Console App

This application simulates a simple e-commerce system via console for demonstration purposes. It is built using clean **Object-Oriented Programming (OOP)** principles.

## 📘 How to Use the Program

When the program starts, you will see a menu:

```
1. View Products  
2. Add to Cart  
3. Checkout  
4. Exit
```

### ➤ To Add Products to Cart:

- Choose option `2`  
- Enter the product number as shown in the product list (option `1`)  
- Enter the quantity you want (must not exceed available stock)

### ➤ To View Products:

- Choose option `1` to list all available products with:
  - Name  
  - Price  
  - Quantity

### ➤ To Checkout:

- Choose option `3`  
- The system will:
  - Check if the cart is **not empty**  
  - Check product **availability** and **expiry**  
  - Check if the customer's **balance is sufficient**  
  - Deduct product quantities from inventory  
  - Deduct total amount from customer balance  
  - Print:
    - Checkout receipt  
    - Shipping notice with item weights if applicable  
  - 🚨 **Automatically clear the cart after successful checkout**

## ✅ Supported Product Types

- `NormalProduct`: Regular item, no expiry or shipping  
- `ExpirableProduct`: Has an expiry date (e.g., Cheese, Biscuits)  
- `ShippableProduct`: Requires shipping and has weight (e.g., TV)  
- `ExpirableShippableProduct`: Both expirable and shippable

## 💡 Notes

- **Shipping cost** is fixed at **30 EGP** (only applies if any item requires shipping)  
- Checkout will **fail** if:
  - The cart is empty  
  - A product is expired or out of stock  
  - Customer balance is not enough  
- The cart is **cleared automatically** after a successful checkout

## 🧪 Example Flow

```plaintext
1. View Products
2. Add to Cart
3. Checkout
4. Exit

** Shipment notice **
2x Cheese 400g  
1x Biscuits 700g  
Total package weight 1.1kg  

** Checkout receipt **
2x Cheese        200  
1x Biscuits      150  
----------------------  
Subtotal         350  
Shipping         30  
Amount           380  
Balance after    620  
```

## 👨‍💻 Developer

Prepared as part of **Fawry Internship Challenge**  
Author: **Mohamed Ehap Ali Zean Al Abdin**
