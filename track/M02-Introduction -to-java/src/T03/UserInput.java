import java.util.Scanner;

public class UserInput {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of integer");
        int a = sc.nextInt();
        System.out.println("integer value is: " + a);

        System.out.println("enter the value of Byte");
        byte b = sc.nextByte();
        System.out.print("Byte value is:" + b);

        System.out.println("enter the value of short");
        short c = sc.nextShort();
        System.out.println("the value of the short is: " + c);

        System.out.println("enter the value of long");
        long d = sc.nextLong();
        System.out.println("the value of the long is:" + d);

        System.out.println("enter the value of the float");
        float e = sc.nextFloat();
        System.out.println("the value of the float is : " + e);

        System.out.println("enter the value of double");
        double f = sc.nextDouble();
        System.out.println("the double value is : " + f);

        System.out.println("enter the value of boolean");
        boolean g = sc.nextBoolean();
        System.out.println("the value of boolean: " + g);
        sc.close();

    }
}