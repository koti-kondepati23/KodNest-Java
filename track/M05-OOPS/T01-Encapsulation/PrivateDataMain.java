
import java.util.Scanner;

public class PrivateDataMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();

        PrivateData pc = new PrivateData(price);

        System.out.println(pc.getPrice());

        scanner.close();

    }
}
