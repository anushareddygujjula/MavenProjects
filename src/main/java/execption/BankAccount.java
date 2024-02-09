package execption;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        if (amount < 0) {
            throw new InvalidWithdrawalException("Invalid withdrawal amount: " + amount);
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds: Cannot withdraw " + amount + " from balance " + balance);
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Current balance: " + balance);
    }
}