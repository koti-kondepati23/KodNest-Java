
import java.util.Scanner;

class Studentcls {

    String name;

    Studentcls(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class StudentNAME {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Studentcls s1 = new Studentcls(name);
        s1.display();
        scanner.close();
    }
}
