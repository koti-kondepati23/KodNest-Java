import java.util.Scanner;

class MethodDemo {
    void sayHello() {

        System.out.println("Hello from a method!");
    }

    void greet(String name) {

        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {

        return 7;
    }

    int add(int first, int second) {
        return first+second;
    }
}

public class FourMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MethodDemo d1 = new MethodDemo();
        String name = scanner.nextLine();
        int first =scanner.nextInt();
        int second = scanner.nextInt();
        d1.sayHello();
        d1.greet(name);
        int res = d1.getLuckyNumber();
        int sum = d1.add(first,second);
        System.out.println("Lucky Number: " + res);
        System.out.println("Sum: " + sum);
        scanner.close();

    }
}
