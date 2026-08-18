
import java.util.Scanner;

class DeliveryCalculator {

    int calculateCharge(int distance) {
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        return distance * 5 + expressFee;
    }
}

public class Delivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();
        DeliveryCalculator d1 = new DeliveryCalculator();
        int dis = d1.calculateCharge(distance);
        int ex = d1.calculateCharge(distance, expressFee);
        System.out.println("Standard Charge: " + dis);
        System.out.println("Express Charge: " + ex);

        scanner.close();
    }
}
