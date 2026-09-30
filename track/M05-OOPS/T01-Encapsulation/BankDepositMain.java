
import java.util.*;

public class BankDepositMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double openingBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        BankDeposit ac = new BankDeposit(openingBalance);
        ac.deposit(depositAmount);
        System.out.println(ac.getBalance());
        scanner.close();
    }
}
