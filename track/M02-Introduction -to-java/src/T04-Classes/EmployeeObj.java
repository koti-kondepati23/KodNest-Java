class Employee {
    int id ;
    String name;

    void work() {
        System.out.println("Working");
    }
}
public class EmployeeObj {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.id = 12;
        e1.name = "Koti";

        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
    }
    
}
