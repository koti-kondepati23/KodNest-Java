
import java.util.Scanner;

class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        return price * quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        return subtotal + deliveryCharge;
    }
}

public class FoodOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();
        OrderCalculator obj = new OrderCalculator();
        int amount = obj.calculateSubtotal(price, quantity);
        int finalAmount = obj.calculateFinalTotal(amount, deliveryCharge);
        System.out.println("Subtotal: " + amount);
        System.out.println("Final Total: " + finalAmount);
        scanner.close();

    }
}
