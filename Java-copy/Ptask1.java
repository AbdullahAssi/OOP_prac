abstract class BankAccount {
    public double balance;
    public int numDeposits;
    public int numWithdrawals;
    public double annualInterestRate;
    public double monthlyServiceCharges;

    public BankAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        numDeposits = 2;
        numWithdrawals = 1;
        monthlyServiceCharges = 0.0;
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
        numDeposits = 3;
        numWithdrawals = 4;
        monthlyServiceCharges = 100.0;
    }
}

class SavingsAccount extends BankAccount {
    public boolean isActive;

    public SavingsAccount(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
        isActive = (balance >= 25);
    }

    @Override
    public void withdraw(double amount) {
        if (isActive) {
            super.withdraw(amount);
            if (balance < 25) {
                isActive = false;
            }
        } else {
            System.out.println("Withdrawal not allowed. Account is inactive.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (!isActive && (balance + amount) >= 25) {
            isActive = true;
        }
        super.deposit(amount);
    }

    @Override
    public void monthlyProcess() {
        if (numWithdrawals > 4) {
            monthlyServiceCharges += (numWithdrawals - 4);
        }
        super.monthlyProcess();
        if (balance < 25) {
            isActive = false;
        }
    }
}

public class Ptask1 {
    public static void main(String[] args) {
        SavingsAccount obj1 = new SavingsAccount(10000, 0.05);
        obj1.withdraw(50);
        obj1.deposit(30);
        obj1.withdraw(10);
        obj1.monthlyProcess();

        System.out.println("Balance: " + obj1.balance+ "Pkr");
        System.out.println("Number of Deposits: " + obj1.numDeposits);
        System.out.println("Number of Withdrawals: " + obj1.numWithdrawals);
        System.out.println("Monthly Service Charges: " + obj1.monthlyServiceCharges+ "Pkr");
        System.out.println("Account Status: " + (obj1.isActive ? "Active" : "Inactive"));
    }
}
