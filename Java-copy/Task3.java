
abstract class BankAccount {
    protected int balance;

    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    public abstract void deposit(int amount);

    public abstract void withdraw(int amount);

    public int getBalance() {
        return balance;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount+"Pkr");
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount +"Pkr");
        } else {
            System.out.println("Low Balance");
        }
    }
}


class SavingsAccount extends BankAccount {
    public SavingsAccount(int initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount+"Pkr");
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount+"Pkr");
        } else {
            System.out.println("Low Balance");
        }
    }
}





public class Task3 {
    public static void main(String[] args) {
        CurrentAccount obj1 = new CurrentAccount(1000);
        SavingsAccount obj2 = new SavingsAccount(10000);

        obj1.deposit(300);
        obj2.withdraw(100);
        System.out.println("Savings Account balance: " + obj1.getBalance()+"Pkr");

        obj2.deposit(10000);
        obj2.withdraw(3000);
        System.out.println("Current Account balance: " + obj2.getBalance()+"Pkr");
    }
}
