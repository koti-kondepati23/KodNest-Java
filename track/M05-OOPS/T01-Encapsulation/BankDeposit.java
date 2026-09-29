
import java.util.Scanner;

class BankDeposit {

    private double balance;

    BankDeposit(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
        // Store opening balance
    }

    public void deposit(double amount) {
        // Add only a positive amount
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        // Return balance
        return balance;
    }
}
