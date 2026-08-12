import java.util.Scanner;

class Studentpro {
    // Declare registrationId, name and attendancePercentage
    int registrationId;
    String name;
    double attendancePercentage;
}

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate firstStudent
        Studentpro firstStudent = new Studentpro();
        firstStudent.registrationId = scanner.nextInt();
        firstStudent.name = scanner.next();
        firstStudent.attendancePercentage = scanner.nextDouble();

        // Create and populate secondStudent
        Studentpro secondStudent = new Studentpro();
        secondStudent.registrationId = scanner.nextInt();
        secondStudent.name = scanner.next();
        secondStudent.attendancePercentage = scanner.nextDouble();

        // Read the selected ID and new attendance
        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        Studentpro selectedStudent = null;

        // Make selectedStudent refer to the matching existing object
        if (firstStudent.registrationId == selectedId) {
            selectedStudent = firstStudent;
        } else if (secondStudent.registrationId == selectedId) {
            selectedStudent = secondStudent;
        }

        // Update through selectedStudent when a match exists
        if (selectedStudent != null) {
            System.out.println("Selected Student: " + selectedStudent.name);
            selectedStudent.attendancePercentage = newAttendance;
        } else {
            System.out.println("Student not found.");
        }

        // Display both records
        System.out.println(firstStudent.registrationId + " - " + firstStudent.name + " - " + firstStudent.attendancePercentage + "%");
        System.out.println(secondStudent.registrationId + " - " + secondStudent.name + " - " + secondStudent.attendancePercentage + "%");

        scanner.close();
    }
}