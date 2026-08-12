import java.util.Scanner;

public class Userinput3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name: ");
        char ch = sc.next().charAt(2);
        System.out.println(ch);
        sc.close();
    }
}