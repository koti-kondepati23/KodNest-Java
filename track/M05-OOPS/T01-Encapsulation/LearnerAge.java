
import java.util.Scanner;

public class LearnerAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        ProtectAge learner = new ProtectAge();
        learner.setAge(age);

        System.out.println(learner.getAge());

        scanner.close();
    }
}
