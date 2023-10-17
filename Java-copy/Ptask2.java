abstract class BankAccount {
    public double balance;
    public String debitCard;
    public String creditCard;
    public double debitCardCharges;
    public double creditCardCharges;

    public BankAccount(double initialBalance, String debitCard, String creditCard) {
        balance = initialBalance;
        this.debitCard = debitCard;
        this.creditCard = creditCard;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public abstract void monthlyProcess();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, String debitCard, String creditCard) {
        super(initialBalance, debitCard, creditCard);
        interestRate = 0.05;
        debitCardCharges = 2.0;
        creditCardCharges = 1.5;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount+"Pkr");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount+"Pkr");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public void monthlyProcess() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest+"Pkr");
        if (debitCard.equals("yes")) {
            balance -= debitCardCharges;
            System.out.println("Debit card charges applied: " + debitCardCharges+"Pkr");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance, String debitCard, String creditCard) {
        super(initialBalance, debitCard, creditCard);
        debitCardCharges = 1.0;
        creditCardCharges = 0.5;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount+"Pkr");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount+"Pkr");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public void monthlyProcess() {
        if (debitCard.equals("yes")) {
            balance -= debitCardCharges;
            System.out.println("Debit card charges applied: " + debitCardCharges+"Pkr");
        }
        if (creditCard.equals("yes")) {
            balance -= creditCardCharges;
            System.out.println("Credit card charges applied: " + creditCardCharges+"Pkr");
        }
    }
}

public class Ptask2 {
    public static void main(String[] args) {
        SavingsAccount obj1 = new SavingsAccount(1000.0, "yes", "no");
        CurrentAccount currentAccount = new CurrentAccount(520000.0, "yes", "yes");

        obj1.deposit(50000.0);
        obj1.withdraw(20000.0);
        System.out.println("Savings Account Balance: " + obj1.getBalance()+"Pkr");
        obj1.monthlyProcess();
        System.out.println("Updated Savings Account Balance: " + obj1.getBalance()+"Pkr");

        currentAccount.deposit(1000.0);
        currentAccount.withdraw(30000.0);
        System.out.println("Current Account Balance: " + currentAccount.getBalance()+"Pkr");
        currentAccount.monthlyProcess();
        System.out.println("Updated Current Account Balance: " + currentAccount.getBalance()+"Pkr");
    }
}
