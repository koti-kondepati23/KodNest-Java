
import java.util.*;

public class ArrayFreqMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        ArrayFreq f1 = new ArrayFreq();
        f1.count(arr, target);
        sc.close();
    }
}
