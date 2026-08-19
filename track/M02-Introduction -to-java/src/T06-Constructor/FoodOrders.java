
import java.util.Scanner;

class FoodOrder1 {

    String item;
    int quantity;

    FoodOrder1(String item) {
        this.item = item;
        this.quantity = 1;
    }

    FoodOrder1(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class FoodOrders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        int quantity = scanner.nextInt();
        FoodOrder1 f1 = new FoodOrder1(item);
        f1.display();
        FoodOrder1 f2 = new FoodOrder1(item, quantity);
        f2.display();
        scanner.close();
    }
}
