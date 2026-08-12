import java.util.Scanner;

public class NumberRangeAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int evenSum = 0;
        int oddCount = 0;

        int i = start;

        while (i <= end) {

            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddCount++;
            }

            i++;
        }

        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd count: " + oddCount);

        scanner.close();
    }
}