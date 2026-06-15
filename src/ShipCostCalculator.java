import java.util.Scanner;
public class ShipCostCalculator {
    public static void main() {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double shippingCost = 0.0;
        double totalPrice = 0.0;
        String invalidInput = "";

        System.out.print("Please enter the price of the item: $");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100.0) {
                shippingCost = 0.0;
            } else {
                shippingCost = itemPrice * 0.02;
            }
            totalPrice = itemPrice + shippingCost;
            System.out.println("Shipping Cost: $" + shippingCost);
            System.out.println("Total Price: $" + totalPrice);
        } else {
            invalidInput = in.nextLine();
            System.out.println("Invalid input: " + invalidInput);
            System.out.println("Please input a valid number.");
        }
    }
}