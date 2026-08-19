
import java.util.*;

public class Array2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[rows][column];
        System.out.println("Enter elements: ");
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= column - 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array is: ");
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= column - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
