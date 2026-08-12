import java.util.Scanner;

class StudentUtility {

    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    float getPassingPercentage() {
        return 60.0f;
    }

    float calculatePercentage(int javaScore, int sqlScore) {
        return (float) (javaScore + sqlScore) / 2;
    }
}

public class StudentUtilityMethods {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    StudentUtility utility = new StudentUtility();
    int id = scanner.nextInt();
    scanner.nextLine();
    String name = scanner.nextLine();
    int javaScore = scanner.nextInt();
    int sqlScore = scanner.nextInt();
    utility.showReportTitle();
    utility.displayStudent(id, name);
    float passingPercentage = utility.getPassingPercentage();
    float avg = utility.calculatePercentage(javaScore, sqlScore);
    System.out.println("Percentage: " + avg);
    if (avg >= passingPercentage) {
        System.out.println("Result: PASS");
    } else {
        System.out.println("Result: NEEDS IMPROVEMENT");
    }

    scanner.close();
}
}