
import java.util.Scanner;

public class UserInputPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int solprblms = scanner.nextInt();
        double percentage = scanner.nextDouble();
        System.out.println("Learner: " + name);
        System.out.println("Problems solved: " + solprblms);
        System.out.println("Assessment: " + percentage);
        // Read and display the profile

        scanner.close();
    }
}