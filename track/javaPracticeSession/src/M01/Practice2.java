public class Practice2 {
    public static void main(String[] args) {
        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;
        

        // Write your code here.
        double Reportvalue=solvedProblems;
        int WholePercentage=(int)exactPercentage;
        double avg=(double)solvedProblems/practiceDays;
        boolean target=avg>=9.0;
        System.out.println("Report value: " + Reportvalue);
        System.out.println("Whole Percentage: " + WholePercentage);
        System.out.println("Average Per Day: " + avg);
        if(avg>=9){
        System.out.println("Daily Target Reached: " + target);
        }
       

    }
}
