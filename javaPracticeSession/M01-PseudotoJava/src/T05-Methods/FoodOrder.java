import java.util.Scanner;

class OrderCalculator {
    int calculateSubtotal(int price, int quantity) {
        // Return price multiplied by quantity
        return price*quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        // Return subtotal plus delivery charge
        return subtotal+deliveryCharge;                          
    }
}

public class FoodOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();

        // Create one OrderCalculator object
        OrderCalculator obj = new OrderCalculator();

        // Call both methods
        int amount = obj.calculateSubtotal(price,quantity);
        int finalAmount = obj.calculateFinalTotal(amount,deliveryCharge);
        // Print the returned values
        System.out.println("Subtotal: " + amount);
        System.out.println("Final Total: " + finalAmount);
        scanner.close();
         
    }
}
