import java.util.Scanner;

class StudentHire {
    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void showName() {
        // Print the stored name
        System.out.println("Student Name: " + this.name);
    }

    void showScore(int first) {
        // Print the first score
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        int total = first + second;
        // Print the total of two scores
        System.out.println("Two-Score Total: " + total);
    }
}

public class HireReady {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the full name and two scores
        String name =scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        // Create one Student object
        StudentHire obj = new StudentHire();
        // Store and print the name
        obj.setName(name);
        obj.showName();
        // Call both showScore() methods
        obj.showScore(first);
        obj.showScore(first,second);
    }
}
