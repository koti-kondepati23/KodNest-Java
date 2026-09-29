
import java.util.*;

public class BankDepositMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read both values
        double openingBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        // Create account and deposit
        BankDeposit ac = new BankDeposit(openingBalance);
        ac.deposit(depositAmount);
        // Print final balance
        System.out.println(ac.getBalance());
    }
}
