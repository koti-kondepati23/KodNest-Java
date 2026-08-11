
import java.util.Scanner;

public class MonthlyExpensive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double r = scanner.nextDouble();
        double f = scanner.nextDouble();
        double t = scanner.nextDouble();
        double total = r + f + t;
        double remaining = m - total;
        System.out.println("Total expense: " + total);
        System.out.println("Remaining: " + remaining);
        if (remaining >= 0) {
            System.out.println("Status: Within budget");

        } else {
            System.out.println("Status: Over budget");
        }
        scanner.close();
    }
}