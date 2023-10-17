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