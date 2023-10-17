class BitcoinProcessor implements PaymentProcessor {
     String walletDetails;

    public BitcoinProcessor(String walletDetails) {
        this.walletDetails = walletDetails;
    }

    public void verifyWallet() throws PaymentException {
        if (walletDetails.isEmpty()) {
            throw new PaymentException("Bitcoin wallet details are invalid.");
        }
    }

    @Override
    public void processPayment(double amount) throws PaymentException {
        verifyWallet();
        System.out.println("Transaction Successfull");
    }
}