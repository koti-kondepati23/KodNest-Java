
class BankDeposit {

    private double balance;

    BankDeposit(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
