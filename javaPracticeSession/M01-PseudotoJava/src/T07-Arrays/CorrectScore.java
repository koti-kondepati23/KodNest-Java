
import java.util.Scanner;

public class CorrectScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] scores = new int[size];

        for (int index = 0; index < scores.length; index++) {
            scores[index] = scanner.nextInt();
        }

        int correctionIndex = scanner.nextInt();
        int newScore = scanner.nextInt();

        // Create one ScoreEditor object
        ScoreEditor s1 = new ScoreEditor();
        // Correct the score and display the array
        s1.correctScore(scores, correctionIndex, newScore);
        s1.displayScores(scores);
        scanner.close();
    }
}
