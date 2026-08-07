import java.util.Scanner;

public class Userinput2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age: ");
        int a = sc.nextInt();
        System.out.println("the age is: " + a);

        System.out.println("enter the value height");
        float b = sc.nextFloat();
        System.out.println("the height is:" + b);
        sc.nextLine();
        System.out.println("enter the name");
        String name = sc.nextLine();
        System.out.println("Name is:" + name);

    }

}