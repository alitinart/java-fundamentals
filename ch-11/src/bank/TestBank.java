package bank;

public class TestBank {
    public static void main(String[] args) {
        Account account = new Account(1112,"George", 1.25, 1000);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("Account holder name: " + account.getName());
        System.out.println("Account Interest Rate: " + account.getAnnualInterest());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Account Transactions: " + account.getTransactions());
    }
}
