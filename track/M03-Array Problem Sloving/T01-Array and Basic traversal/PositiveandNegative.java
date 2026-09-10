
import java.util.Scanner;

public class PositiveandNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }
            System.out.println(positiveCount + " " + negativeCount + " " + zeroCount);
        }
        scanner.close();
    }
}
