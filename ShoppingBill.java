import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SHOPPING BILL =====");

        System.out.print("Enter item 1 name: ");
        String item1 = sc.nextLine();

        System.out.print("Enter item 1 price: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter item 1 quantity: ");
        int quantity1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter item 2 name: ");
        String item2 = sc.nextLine();

        System.out.print("Enter item 2 price: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter item 2 quantity: ");
        int quantity2 = sc.nextInt();

        double total1 = price1 * quantity1;
        double total2 = price2 * quantity2;

        double subtotal = total1 + total2;

        double discount;

        if (subtotal >= 1000) {
            discount = subtotal * 0.10;
        } else {
            discount = subtotal * 0.05;
        }

        double finalAmount = subtotal - discount;

        System.out.println("\n===== BILL =====");
        System.out.println("Item 1: " + item1);
        System.out.println("Amount: ₹" + total1);

        System.out.println("Item 2: " + item2);
        System.out.println("Amount: ₹" + total2);

        System.out.println("--------------------");
        System.out.println("Subtotal: ₹" + subtotal);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);

        System.out.println("--------------------");
        System.out.println("Thank you for shopping!");

        sc.close();
    }
}
