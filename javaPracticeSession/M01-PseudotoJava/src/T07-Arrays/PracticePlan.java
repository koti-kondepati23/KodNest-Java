
import java.util.Scanner;

public class PracticePlan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        int[] planned = new int[days];
        int[] completed = new int[days];
        for (int i = 0; i <= planned.length - 1; i++) {
            planned[i] = sc.nextInt();
        }
        for (int i = 0; i <= completed.length - 1; i++) {
            completed[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <= days - 1; i++) {
            if (planned[i] <= completed[i]) {
                sum += 1;
                System.out.println("Day " + (i + 1) + ": " + "Completed");
            } else {
                System.out.println("Day " + (i + 1) + ": " + "Pending");
            }
        }
        System.out.println("Completed days: " + sum);
    }
}
