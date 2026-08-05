public class HomeWork1 {
    public static void main(String[] args) {
        // write your code here
        int CompletedTopics=17;
        int TotalTopics=20;
        int DailyLearningHours=3;
        int LearningDays=5;
        int RemainingTopics=TotalTopics-CompletedTopics;
        int WeeklyLearning=DailyLearningHours*LearningDays;
        System.out.println("Completed Topics: " + CompletedTopics);
        System.out.println("Remaining Topics: " +RemainingTopics);
        System.out.println("Weekly Learning Hours: " + WeeklyLearning);
        System.out.println("Progress Percentage: " + (double)CompletedTopics*100/TotalTopics);
    }
}