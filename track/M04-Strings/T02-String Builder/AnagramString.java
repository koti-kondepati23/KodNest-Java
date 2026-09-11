
import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1 and String 2: ");
        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortstr1 = new String(arr1);
        String sortstr2 = new String(arr2);

        if (sortstr1.equals(sortstr2)) {
            System.out.println("Given Strings are Anagram");
        } else {
            System.out.println("Given Strings are not Anagram");
        }

    }

}
