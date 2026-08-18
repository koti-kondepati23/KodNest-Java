
import java.util.Scanner;

class Studentpro {

    int registrationId;
    String name;
    double attendancePercentage;
}

public class StudentRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Studentpro firstStudent = new Studentpro();
        firstStudent.registrationId = scanner.nextInt();
        firstStudent.name = scanner.next();
        firstStudent.attendancePercentage = scanner.nextDouble();

        Studentpro secondStudent = new Studentpro();
        secondStudent.registrationId = scanner.nextInt();
        secondStudent.name = scanner.next();
        secondStudent.attendancePercentage = scanner.nextDouble();

        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        Studentpro selectedStudent = null;

        if (firstStudent.registrationId == selectedId) {
            selectedStudent = firstStudent;
        } else if (secondStudent.registrationId == selectedId) {
            selectedStudent = secondStudent;
        }

        if (selectedStudent != null) {
            System.out.println("Selected Student: " + selectedStudent.name);
            selectedStudent.attendancePercentage = newAttendance;
        } else {
            System.out.println("Student not found.");
        }

        System.out.println(firstStudent.registrationId + " - " + firstStudent.name + " - " + firstStudent.attendancePercentage + "%");
        System.out.println(secondStudent.registrationId + " - " + secondStudent.name + " - " + secondStudent.attendancePercentage + "%");

        scanner.close();
    }
}
