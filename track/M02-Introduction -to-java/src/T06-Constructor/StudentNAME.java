import java.util.Scanner;

class Studentcls {
    String name;

    Studentcls(String name) {
        this.name = name;
        // Store the parameter in the instance variable
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class StudentNAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name
        String name = scanner.nextLine();
        // Create one Student object
        Studentcls s1 = new Studentcls(name);
        // Call display()
        s1.display();
    }
}
