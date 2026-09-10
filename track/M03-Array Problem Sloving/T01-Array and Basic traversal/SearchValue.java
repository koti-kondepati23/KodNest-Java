
import java.util.Scanner;

public class SearchValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int target = scanner.nextInt();

            int firstIndex = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == target) {
                    firstIndex = i;
                    break;
                }
            }
            System.out.println(firstIndex);
        }

        scanner.close();
    }
}
