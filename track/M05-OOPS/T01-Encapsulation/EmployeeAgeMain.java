
import java.util.Scanner;

public class EmployeeAgeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeAge e1 = new EmployeeAge();
        int age = scanner.nextInt();
        if (e1.setAge(age)) {
            System.out.println(e1.getAge());
        } else {
            System.out.println("Invalid age");
        }
    }
}
