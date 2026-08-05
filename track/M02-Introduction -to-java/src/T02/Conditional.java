public class Conditional {
    public static void main(String[] args) {
        int number = -7;
        int firstScore = 18;
        int secondScore =25;
        if (number > 0){
            System.out.println("Number type: Positive");
        }
        else if (number < 0) {
            System.out.println("Number type: Negative");
        } else {
            System.err.println("Number type: Zero");
        }
        if (number % 2 == 0) {
            System.err.println("Parity: Even");
        }
        else {
            System.err.println("Parity: Odd");
        }
        if (firstScore >= secondScore) {
            System.err.println("Larger Score: " + firstScore);
        }
        else {
            System.err.println("Larger Score: " + secondScore);
        }    
    }
    
}
