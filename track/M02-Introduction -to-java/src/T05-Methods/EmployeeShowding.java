import java.util.Scanner;

class Employees {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeShowding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double salary = scanner.nextDouble();

        Employees employee = new Employees();

        employee.setDetails(name, salary);
        employee.displayDetails();

        scanner.close();
    }
}