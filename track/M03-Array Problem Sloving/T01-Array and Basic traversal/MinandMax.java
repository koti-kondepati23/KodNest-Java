
import java.util.Scanner;

public class MinandMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int min = scanner.nextInt();
            int max = min;
            for (int i = 1; i < n; i++) {
                int current = scanner.nextInt();

                if (current < min) {
                    min = current;
                }
                if (current > max) {
                    max = current;
                }
            }
            System.out.println(min + " " + max);
        }

        scanner.close();
    }
}
