
import java.util.Scanner;

class StudentProgress {

    String name;
    int completedLessons;
    int totalLessons;

}

public class ProgressCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentProgress s1 = new StudentProgress();
        s1.name = scanner.nextLine();
        s1.completedLessons = scanner.nextInt();;
        s1.totalLessons = scanner.nextInt();
        int percentage = s1.completedLessons * 100 / s1.totalLessons;
        System.out.println("Student: " + s1.name);
        System.out.println("Progress: " + s1.completedLessons + "/" + s1.totalLessons);
        System.out.println("Completion: " + percentage + "%");
    }
}
