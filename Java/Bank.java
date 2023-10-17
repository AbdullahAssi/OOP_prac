import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a checking account
        System.out.println("Enter the name of the checking account owner: ");
        String checkingAccountOwner = scanner.nextLine();
        System.out.println("Enter the balance of the checking account: ");
        double checkingAccountBalance = scanner.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(checkingAccountOwner, checkingAccountBalance);

        // Create an investment account
        System.out.println("Enter the name of the investment account owner: ");
        String investmentAccountOwner = scanner.nextLine();
        System.out.println("Enter the balance of the investment account: ");
        double investmentAccountBalance = scanner.nextDouble();
        InvestmentAccount investmentAccount = new InvestmentAccount(investmentAccountOwner, investmentAccountBalance);

        // Get the name of each account owner and print it
        System.out.println("The name of the checking account owner is " + checkingAccount.getOwner());
        System.out.println("The name of the investment account owner is " + investmentAccount.getOwner());

        // Get the minimum balance limit for each type of account
        System.out.println("The minimum balance limit for a checking account is " + CheckingAccount.minimumBalance);

        // Check the balance of each account
        System.out.println("The balance of the checking account is " + checkingAccount.getBalance());
        System.out.println("The balance of the investment account is " + investmentAccount.getBalance());

        // Withdraw money from each account
        System.out.println("Enter the amount of money to withdraw from the checking account: ");
        double amountToWithdraw = scanner.nextDouble();
        checkingAccount.withdraw(amountToWithdraw);
        System.out.println("The new balance of the checking account is " + checkingAccount.getBalance());

        System.out.println("Enter the amount of money to withdraw from the savings account: ");
        amountToWithdraw = scanner.nextDouble();

        System.out.println("Enter the amount of money to withdraw from the investment account: ");
        amountToWithdraw = scanner.nextDouble();
        investmentAccount.withdraw(amountToWithdraw);
        System.out.println("The new balance of the investment account is " + investmentAccount.getBalance());
    }
}

class Account {

    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InsufficientFundsException("Insufficient balance!");
        }
    }
}

class CheckingAccount extends Account {

    static double minimumBalance = 100;

    public CheckingAccount(String owner, double balance) {
        super(owner, balance);
    }

    public static double getMinimumBalance() {
        return minimumBalance;
    }
}