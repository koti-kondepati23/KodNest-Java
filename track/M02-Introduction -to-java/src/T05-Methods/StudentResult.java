import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        return first+second;
    }

    int getTotal(int first, int second, int third) {
        return first+second+third;
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        ResultCalculator obj = new ResultCalculator();
        int method1 = obj.getTotal(first,second);
        int method2 = obj.getTotal(first,second,third);

        System.out.println("Two-Mark Total: " + method1);
        System.out.println("Three-Mark Total: " + method2);
        scanner.close();
    }
}
