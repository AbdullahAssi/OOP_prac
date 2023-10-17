import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account[] accounts = new Account[3];

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Enter the name of account holder " + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("Enter the account number:");
            String accountNumber = sc.nextLine();

            System.out.println("Enter the initial balance:");
            double balance = sc.nextDouble();
            sc.nextLine(); 

            System.out.println("Enter the account type (1 - Savings, 2 - Checking):");
            int accountType = sc.nextInt();
            sc.nextLine(); 

            if (accountType == 1) {
                System.out.println("Enter the interest rate:");
                double interestRate = sc.nextDouble();
                sc.nextLine(); 

                accounts[i] = new SavingsAccount(name, accountNumber, balance, interestRate);
            } else if (accountType == 2) {
                System.out.println("Enter the account limit:");
                double limit = sc.nextDouble();
                sc.nextLine(); 

                accounts[i] = new CheckingAccount(name, accountNumber, balance, limit);
            }
        }

        boolean continueChecking = true;
        while (continueChecking) {
            System.out.println("Enter the account number to login:");
            String accountNumberToLogin = sc.nextLine();

            Account loggedInAccount = null;
            for (Account account : accounts) {
                if (account.getAccountNumber().equals(accountNumberToLogin)) {
                    loggedInAccount = account;
                    break;
                }
            }

            if (loggedInAccount != null) {
                System.out.println("Login successful!");
                System.out.println("Welcome, " + loggedInAccount.getName());

                System.out.println("Select an operation:");
                System.out.println("1. Withdraw money");
                System.out.println("2. Check profile");
                int operationChoice = sc.nextInt();
                sc.nextLine(); // Consume the remaining newline character

                if (operationChoice == 1) {
                    System.out.println("Enter the amount to withdraw:");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    loggedInAccount.withdraw(amount);
                } else if (operationChoice == 2) {
                    System.out.println("Account holder: " + loggedInAccount.getName());
                    System.out.println("Account number: " + loggedInAccount.getAccountNumber());
                    System.out.println("Account balance: " + loggedInAccount.getBalance());

                    if (loggedInAccount instanceof SavingsAccount) {
                        SavingsAccount savingsAccount = (SavingsAccount) loggedInAccount;
                        System.out.println("Interest rate: " + savingsAccount.getInterestRate());
                    } else if (loggedInAccount instanceof CheckingAccount) {
                        CheckingAccount checkingAccount = (CheckingAccount) loggedInAccount;
                        System.out.println("Account limit: " + checkingAccount.getLimit());
                    }
                } else {
                    System.out.println("Invalid operation choice.");
                }
            } else {
                System.out.println("Login failed. Account not found.");
            }

            System.out.println("Do you want to check another account? (yes/no):");
            String continueChoice = sc.nextLine();
            continueChecking = continueChoice.equalsIgnoreCase("yes");
        }
    }
}

