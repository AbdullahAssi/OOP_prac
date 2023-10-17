class CreditCardProcessor implements PaymentProcessor {
    String CC_Number;

    public CreditCardProcessor() {
        this.CC_Number = "";
    }

    public CreditCardProcessor(String CC_Number) {
        this.CC_Number = CC_Number;
    }

    public void validateCreditCard() throws PaymentException {
        if (CC_Number.length() != 16) {
            throw new PaymentException("Credit card number is invalid.");
        }
    }

    @Override
    public void processPayment(double amount) throws PaymentException {
        validateCreditCard();
        System.out.println("Transction Successfull!");
    }
}