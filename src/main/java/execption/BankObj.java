package execption;

public class BankObj {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(4000.0);
        BankAccount account2 = new BankAccount(4000.0);

        try {
            account1.withdraw(500.0);

            account1.withdraw(-200.0);

        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println(e.getMessage());
        }

        try {
            account2.withdraw(7000.0);

        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            System.out.println(e.getMessage());
        }
    }
}