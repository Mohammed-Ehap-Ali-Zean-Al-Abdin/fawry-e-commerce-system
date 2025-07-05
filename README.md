// E-Commerce Console App in Java
// ----------------------------------
// This application simulates a simple e-commerce system via console
// for demonstration purposes. It is built using Object-Oriented Programming (OOP) principles.
//
// --------------------------
// 📘 How to Use the Program
// --------------------------
//
// When the program starts, you will see a menu:
//   1. View Products
//   2. Add to Cart
//   3. Checkout
//   4. Exit
//
// ➤ To Add Products to Cart:
//   - Choose option 2
//   - Enter the product number as shown in option 1
//   - Enter the quantity you want (must not exceed stock)
//
// ➤ To View Products:
//   - Choose option 1 to list all products with prices and availability
//
// ➤ To Checkout:
//   - Choose option 3
//   - The system will:
//     - Check if the cart is not empty
//     - Check product availability and expiry
//     - Check if your balance is enough
//     - Deduct item quantities from inventory
//     - Deduct amount from your balance
//     - Print receipt and shipping info if needed
//     - 🚨 Automatically clear the cart after successful checkout
//
// --------------------------
// ✅ Supported Product Types
// --------------------------
// - NormalProduct: Regular item, no expiry or shipping
// - ExpirableProduct: Has an expiry date
// - ShippableProduct: Requires shipping and has weight
// - ExpirableShippableProduct: Both expirable and shippable
//
// --------------------------
// 💡 Notes
// --------------------------
// - Fixed shipping cost: 30 EGP (applied only if items require shipping)
// - Expired or out-of-stock items will block checkout
// - The customer's balance must cover total + shipping
