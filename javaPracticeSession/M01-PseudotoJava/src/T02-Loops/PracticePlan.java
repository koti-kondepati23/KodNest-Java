
public class PracticePlan {

    public static void main(String[] args) {
        int practiceDays = 5;
        int sessionsPerDay = 2;
        int revisionDay = 3;
        int finalDaySessionLimit = 1;
        int targetSessions = 7;
        int completedSessions = 0;
        for (int days = 1; days <= practiceDays; days++) {
            if (days == revisionDay) {
                continue;
            }
            for (int session = 1; session <= sessionsPerDay; session++) {

                System.out.println("Day " + days + " - Session " + session);
                completedSessions++;
                if (days == practiceDays && session == finalDaySessionLimit) {
                    break;
                }
            }

        }
        System.out.println("Completed Sessions: " + completedSessions);
        if (completedSessions >= targetSessions) {
            System.out.println("Target Achieved");
        }

    }
}
