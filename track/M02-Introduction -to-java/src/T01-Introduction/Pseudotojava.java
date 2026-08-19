
public class Pseudotojava {
    public static void main(String[] args) {
  
        int javaHoursPerDay = 2;
        int aptitudeHoursPerDay = 1;
        int numberofDays = 5;
        int weeklyJavaHours = javaHoursPerDay * numberofDays;
        int weeklyAptitudeHours = aptitudeHoursPerDay * numberofDays;
        int totalPreparationHours = weeklyJavaHours + weeklyAptitudeHours;
        System.out.println("Java: " + weeklyJavaHours);
        System.out.println("Aptitude: " + weeklyAptitudeHours);
        System.out.println("Total: " + totalPreparationHours);
    }
}