
public class ArrayFreq {

    void count(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("Frequency of " + target + " is : " + count);
    }

}
