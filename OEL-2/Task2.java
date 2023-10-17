import java.util.Calendar;

abstract class BankAccount {
    protected double balance;
    protected int numDeposits;
    protected int numWithdrawals;
    protected double annualInterestRate;
    protected double monthlyServiceCharges;
    protected String debitCard;
    protected String creditCard;

    public BankAccount(double balance, double annualInterestRate, String debitCard, String creditCard) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.numDeposits = 0;
        this.numWithdrawals = 0;
        this.monthlyServiceCharges = 0.0;
        this.debitCard = debitCard;
        this.creditCard = creditCard;
    }

    public void deposit(double amount) {
        balance += amount;
        numDeposits++;
    }

    public void withdraw(double amount) {
        balance -= amount;
        numWithdrawals++;
    }

    public void calcInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
    }

    public abstract void monthlyProcess();

    public abstract void yearlyProcess();

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private boolean isActive;
    protected double debitCardCharges;
    protected double creditCardCharges;

    public SavingsAccount(double balance, double annualInterestRate, String debitCard, String creditCard) {
        super(balance, annualInterestRate, debitCard, creditCard);
        isActive = true;
    }

    @Override
    public void withdraw(double amount) {
        if (isActive) {
            numWithdrawals++; // Increment numWithdrawals before withdrawing
            super.withdraw(amount);
            if (balance < 25)
                isActive = false;
        }
    }

    @Override
    public void deposit(double amount) {
        if (!isActive && balance + amount > 25)
            isActive = true;
        super.deposit(amount);
    }

    @Override
    public void monthlyProcess() {
        if (numWithdrawals > 4) {
            double serviceCharge = (numWithdrawals - 4) * 1.0;
            monthlyServiceCharges += serviceCharge;
        }

        balance -= monthlyServiceCharges;
        calcInterest();
        numDeposits = 0;
        numWithdrawals = 0;
        monthlyServiceCharges = 0.0;

        if (balance < 25)
            isActive = false;
    }

    @Override
    public void yearlyProcess() {
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int date = Calendar.getInstance().get(Calendar.DATE);

        if (month == Calendar.DECEMBER && date == 31) {
            if (debitCard.equals("Yes"))
                balance -= debitCardCharges;
            if (creditCard.equals("Yes"))
                balance -= creditCardCharges;
        }
    }
}

class CurrentAccount extends BankAccount {
    protected double debitCardCharges;
    protected double creditCardCharges;

    public CurrentAccount(double balance, double annualInterestRate, String debitCard, String creditCard) {
        super(balance, annualInterestRate, debitCard, creditCard);
    }

    @Override
    public void monthlyProcess() {
        balance -= monthlyServiceCharges;
        numDeposits = 0;
        numWithdrawals = 0;
        monthlyServiceCharges = 0.0;
    }

    @Override
    public void yearlyProcess() {
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int date = Calendar.getInstance().get(Calendar.DATE);

        if (month == Calendar.DECEMBER && date == 31) {
            if (debitCard.equals("Yes"))
                balance -= debitCardCharges;
            if (creditCard.equals("Yes"))
                balance -= creditCardCharges;
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05, "Yes", "No");
        savingsAccount.debitCardCharges = 10.0;
        savingsAccount.creditCardCharges = 0.0;

        CurrentAccount currentAccount = new CurrentAccount(2000, 0.0, "No", "Yes");
        currentAccount.debitCardCharges = 0.0;
        currentAccount.creditCardCharges = 20.0;

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(50);
        savingsAccount.deposit(100);
        savingsAccount.withdraw(30);

        currentAccount.deposit(1000);
        currentAccount.withdraw(500);
        currentAccount.withdraw(200);
        currentAccount.deposit(300);
        currentAccount.withdraw(100);

        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        System.out.println("Number of deposits: " + savingsAccount.numDeposits);
        System.out.println("Number of withdrawals: " + savingsAccount.numWithdrawals);

        savingsAccount.monthlyProcess();

        System.out.println("Savings Account Balance after monthly process: $" + savingsAccount.getBalance());
        System.out.println("Number of deposits after monthly process: " + savingsAccount.numDeposits);
        System.out.println("Number of withdrawals after monthly process: " + savingsAccount.numWithdrawals);

        savingsAccount.yearlyProcess();
        System.out.println("Savings Account Balance after yearly process: $" + savingsAccount.getBalance());

        System.out.println();

        System.out.println("Current Account Balance: $" + currentAccount.getBalance());
        System.out.println("Number of deposits: " + currentAccount.numDeposits);
        System.out.println("Number of withdrawals: " + currentAccount.numWithdrawals);

        currentAccount.monthlyProcess();

        System.out.println("Current Account Balance after monthly process: $" + currentAccount.getBalance());
        System.out.println("Number of deposits after monthly process: " + currentAccount.numDeposits);
        System.out.println("Number of withdrawals after monthly process: " + currentAccount.numWithdrawals);

        currentAccount.yearlyProcess();
        System.out.println("Current Account Balance after yearly process: $" + currentAccount.getBalance());
    }
}