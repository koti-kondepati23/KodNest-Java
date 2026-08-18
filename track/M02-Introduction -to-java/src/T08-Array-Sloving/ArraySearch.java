
public class ArraySearch {

    void search(int[] marks, int target) {
        boolean found = true;
        for (int i = 0; i <= marks.length - 1; i++) {
            if (marks[i] == target) {
                System.out.println("Found at:" + i);
                found = false;
                break;
            }
        }
        if (found) {
            System.out.println("Not Found");
        }
    }

}
