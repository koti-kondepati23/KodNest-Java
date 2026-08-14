import java.util.Scanner;

class DeliveryCalculator {
    int calculateCharge(int distance) {
        // Return the standard charge
        return distance*5;
    }

    int calculateCharge(int distance, int expressFee) {
        // Return the express charge
        return distance*5 + expressFee;
    }
}

public class Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();

        // Create one DeliveryCalculator object
        DeliveryCalculator d1 = new DeliveryCalculator();
        // Call the one-parameter overload
        int dis = d1.calculateCharge(distance);
        // Call the two-parameter overload
        int ex = d1.calculateCharge(distance,expressFee);
        // Print both returned charges
        System.out.println("Standard Charge: " + dis);
        System.out.println("Express Charge: " + ex);
    }
}
