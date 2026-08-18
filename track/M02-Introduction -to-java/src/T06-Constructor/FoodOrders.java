
import java.util.Scanner;

class FoodOrder1 {

    String item;
    int quantity;

    FoodOrder1(String item) {
        this.item = item;
        this.quantity = 1;
        // Store the item and set quantity to 1
    }

    FoodOrder1(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        // Store both values
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class FoodOrders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the item and quantity
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();
        // Create one order with the first constructor
        FoodOrder1 f1 = new FoodOrder1(item);
        f1.display();
        // Create one order with the second constructor
        FoodOrder1 f2 = new FoodOrder1(item, quantity);
        // Display both orders
        f2.display();
        scanner.close();
    }
}
