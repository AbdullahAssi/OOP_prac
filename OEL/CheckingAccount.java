class CheckingAccount extends Account {
    private final  double limit;

    public CheckingAccount(String name, String accountNumber, double balance, double limit) {
        super(name, accountNumber, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void withdraw(double amount) {
        if (amount <= (getBalance() + limit)) {
            setBalance(getBalance() - amount);
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}