class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, String accountNumber, double balance, double interestRate) {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}