class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("Error: Invalid withdrawal amount. The amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient funds. Available balance: " + balance + "Pkr");
        }

        balance -= amount;
        System.out.println("Withdrawing ...." + amount + "\n\n... Withdrawal successful.");
        System.out.println("Remaining amount "+balance+"Pkr");
    }
    
    public void addMoney(double amount) throws InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("Error: Invalid deposit amount. The amount must be positive.");
        }
    
        try {
            balance += amount;
            System.out.println("Added " + amount + "Successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getAccountNum(){
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
}