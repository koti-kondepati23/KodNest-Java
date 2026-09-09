
import java.util.Scanner;

public class ReadCourse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("Course: " + s1);
        System.out.println("Trainer: " + s2);

        scanner.close();
    }
}
