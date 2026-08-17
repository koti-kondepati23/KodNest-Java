
import java.util.Scanner;

public class ShowScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] scores = new int[size];

        // Read all scores into the array
        for (int i = 0; i <= size - 1; i++) {
            scores[i] = sc.nextInt();
        }
        // Display the scores from last to first
        System.out.print("Reverse scores: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(scores[i] + " ");
        }
    }
}
