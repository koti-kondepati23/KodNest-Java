
public class ScoreEditor {

    void correctScore(int[] scores, int index, int newScore) {
        if (index >= 0 && index <= scores.length - 1) {
            scores[index] = newScore;
        } else {
            System.out.println("Invalid index");
        }
    }

    void displayScores(int[] scores) {
        System.out.print("Scores: ");
        for (int i = 0; i <= scores.length - 1; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}
