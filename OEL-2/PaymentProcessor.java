interface PaymentProcessor{
    public void processPayment(double amount) throws  PaymentException;
}