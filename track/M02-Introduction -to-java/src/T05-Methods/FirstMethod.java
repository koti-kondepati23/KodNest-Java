class Robot {
    void speak() {
        // Print the message
        System.out.println("Beep beep! Java is my superpower!");
    }
}

public class FirstMethod {
    public static void main(String[] args) {
        // Create a Robot object
        Robot r1 = new Robot();
        // Call speak()
        r1.speak();
    }
}
