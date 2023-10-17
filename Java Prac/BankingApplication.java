
import java.io.*;
import java.util.Scanner;
// Abstract class representing a bank account
abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    // toString method
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\nAccount Holder: " + accountHolder + "\nBalance: $" + balance;
    }
}

// SavingsAccount is a subclass of BankAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    // Implementing abstract methods from BankAccount
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Additional method specific to SavingsAccount
    public void applyInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest applied. New balance: $" + balance);
    }
}



// Interface representing file operations
interface FileOperations {
    void writeToFile(String filename, String content);
    String readFromFile(String filename);
}

// BankFileManager implements FileOperations interface
class BankFileManager implements FileOperations {
    @Override
    public void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Data written to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + filename);
        }
    }

    @Override
    public String readFromFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + filename);
        }
        return content.toString();
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for account information
        System.out.println("Enter Account Number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter Account Holder Name:");
        String accountHolder = scanner.nextLine();

        System.out.println("Enter Initial Balance:");
        double initialBalance = scanner.nextDouble();

        System.out.println("Enter Interest Rate:");
        double interestRate = scanner.nextDouble();

        // Create a SavingsAccount object with user-provided information
        SavingsAccount account = new SavingsAccount(accountNumber, accountHolder, initialBalance, interestRate);

        // Prompt user for deposit and withdraw operations
        System.out.println("Enter Deposit Amount:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter Withdrawal Amount:");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        // Apply interest
        account.applyInterest();

        // Print account information
        System.out.println(account);

        // Save account information to a file
        FileOperations fileManager = new BankFileManager();
        fileManager.writeToFile("account_info.txt", account.toString());

        // Read account information from the file
        String accountInfoFromFile = fileManager.readFromFile("account_info.txt");
        System.out.println("Account Information from File:\n" + accountInfoFromFile);

        // Close the scanner
        scanner.close();
    }
}
