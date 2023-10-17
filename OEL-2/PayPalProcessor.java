import java.util.*;

class PayPalProcessor implements PaymentProcessor {
    String acc_Details;

    public PayPalProcessor(String acc_Details) {
        this.acc_Details = acc_Details;
    }

    public void authenticateAccount() throws PaymentException {
        if (acc_Details.length() < 12) {
            throw new PaymentException("PayPal account details are invalid.");
        }
    }

    @Override
    public void processPayment(double amount) throws PaymentException {
        authenticateAccount();
        System.out.println("Transaction Successful! ");
    }
}
