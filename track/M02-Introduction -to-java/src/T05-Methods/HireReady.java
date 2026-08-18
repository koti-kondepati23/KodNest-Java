
import java.util.Scanner;

class StudentHire {

    String name;

    void setName(String name) {

        this.name = name;
    }

    void showName() {

        System.out.println("Student Name: " + this.name);
    }

    void showScore(int first) {

        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        int total = first + second;

        System.out.println("Two-Score Total: " + total);
    }
}

public class HireReady {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        StudentHire obj = new StudentHire();
        obj.setName(name);
        obj.showName();
        obj.showScore(first);
        obj.showScore(first, second);
        scanner.close();
    }
}
