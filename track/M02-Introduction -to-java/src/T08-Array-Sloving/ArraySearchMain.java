
import java.util.*;

public class ArraySearchMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        ArraySearch a1 = new ArraySearch();
        a1.search(arr, target);
        sc.close();
    }

}
