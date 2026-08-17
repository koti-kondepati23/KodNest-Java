
import java.util.Scanner;

class Employeesrole {

    String name;
    String role;

    Employeesrole() {
        this.role = "Trainee";
    }

    void displayProfile() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Role: " + this.role);
    }
}

public class DefaultEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Employeesrole e1 = new Employeesrole();
        e1.name = name;
        e1.displayProfile();

    }
}
