
import java.util.Scanner;

public class String_Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String s1 = sc.next();

        char[] charArr = s1.toCharArray();

        char[] revArr = new char[charArr.length];

        int j = charArr.length - 1;

        for (int i = 0; i < charArr.length; i++) {
            revArr[i] = charArr[j];
            j--;

        }

        String s2 = new String(revArr);

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("the string is palindrome");
        } else {

            System.out.println("the string is not a palindrome");
        }
        sc.close();

    }
}
