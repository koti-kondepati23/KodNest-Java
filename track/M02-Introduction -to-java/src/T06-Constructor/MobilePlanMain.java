import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    MobilePlan() {
        this.planName = "Basic";
        this.price = 199;
        // Set Basic and 199
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
        // Store both received values
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class MobilePlanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the selected plan name and price
        MobilePlan m1 = new MobilePlan();
        // Create the default plan
        MobilePlan m2 = new MobilePlan(scanner.nextLine() , scanner.nextInt());
        // Create the selected plan
        // Display both plans
        m1.display();
        m2.display();
    }
}
