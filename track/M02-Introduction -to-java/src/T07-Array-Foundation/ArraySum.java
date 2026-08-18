
import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter elemts: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
