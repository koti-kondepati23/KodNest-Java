import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        // Return the total of two marks
        return first+second;
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        return first+second+third;
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        // Create one ResultCalculator object
        ResultCalculator obj = new ResultCalculator();
        // Call both overloaded methods and print both totals
        int method1 = obj.getTotal(first,second);
        int method2 = obj.getTotal(first,second,third);

        System.out.println("Two-Mark Total: " + method1);
        System.out.println("Three-Mark Total: " + method2);
    }
}
