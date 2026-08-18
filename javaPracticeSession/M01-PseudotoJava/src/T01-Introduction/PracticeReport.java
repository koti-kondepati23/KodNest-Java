
public class PracticeReport {

    public static void main(String[] args) {
        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        double RV = solvedProblems;
        System.out.println("Report Value: " + RV);

        System.out.println("Whole Percentage: " + (int) exactPercentage);

        double average = (double) solvedProblems / practiceDays;
        System.out.println("Average Per Day: " + average);

        if (average >= 9.0) {
            System.out.println("Daily Target Reached: true"); 
        }else {
            System.out.println("Daily Target Reached: false");
        }
    }
}
