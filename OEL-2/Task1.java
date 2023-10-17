abstract class BankAccount {
    protected double balance;
    protected int numDeposits;
    protected int numWithdrawals;
    protected double annualInterestRate;
    protected double monthlyServiceCharges;

    public BankAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.numDeposits = 0;
        this.numWithdrawals = 0;
        this.monthlyServiceCharges = 0.0;
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

    public void monthlyProcess() {
        balance -= monthlyServiceCharges;
        calcInterest();
        numDeposits = 0;
        numWithdrawals = 0;
        monthlyServiceCharges = 0.0;
    }
}

class SavingsAccount extends BankAccount {
    private boolean isActive;

    public SavingsAccount(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
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

        super.monthlyProcess();

        if (balance < 25)
            isActive = false;
    }
}

public class Task1 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(50);
        savingsAccount.deposit(100);
        savingsAccount.withdraw(30);

        System.out.println("Balance: $" + savingsAccount.balance);
        System.out.println("Number of deposits: " + savingsAccount.numDeposits);
        System.out.println("Number of withdrawals: " + savingsAccount.numWithdrawals);

        savingsAccount.monthlyProcess();

        System.out.println("Balance after monthly process: $" + savingsAccount.balance);
        System.out.println("Number of deposits after monthly process: " + savingsAccount.numDeposits);
        System.out.println("Number of withdrawals after monthly process: " + savingsAccount.numWithdrawals);
    }
}