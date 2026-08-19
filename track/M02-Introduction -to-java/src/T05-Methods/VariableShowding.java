import java.util.Scanner;

class Stud {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class VariableShowding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Stud student = new Stud();

        student.setName(name);
        student.displayName();

        scanner.close();
    }
}