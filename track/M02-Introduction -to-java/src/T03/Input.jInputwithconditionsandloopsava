
import java.util.Scanner;

public class Inputwithconditionsandloops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int practicedays = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= practicedays; i++) {
            int marks = scanner.nextInt();
            total = total + marks;
        }
        System.out.println("Total solved: " + total);
        if (total < 10) {
            System.out.println("Status: " + "Needs more practice");
        } else if (total > 10 && total < 19) {
            System.out.println("Status: " + "Keep improving");
        } else {
            System.out.println("Status: " + "Strong progress");
        }
        scanner.close();
    }
}