
import java.util.Scanner;

class Employeespr {

    int id;
    String name;
    String department;

    Employeespr(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void displayProfile() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Department: " + this.department);
    }

}

public class EmployeeProfiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String department = sc.nextLine();
        Employeespr e1 = new Employeespr(id, name, department);
        e1.displayProfile();

    }
}
