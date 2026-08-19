
import java.util.Scanner;

public class ArrayMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int max = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Max: " + max);
        sc.close();
    }
}
