import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            int choice;
            do {
                System.out.println("Payment Method Menu:");
                System.out.println("1. Credit Card");
                System.out.println("2. PayPal");
                System.out.println("3. Bitcoin");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        scanner.nextLine(); // Clear the scanner buffer
                        System.out.print("Enter credit card number: ");
                        String creditCardNumber = scanner.nextLine();
                        CreditCardProcessor creditCardProcessor = new CreditCardProcessor(creditCardNumber);
                        System.out.print("Enter payment amount: ");
                        double creditCardAmount = scanner.nextDouble();
                        creditCardProcessor.processPayment(creditCardAmount);
                        break;
                    case 2:
                        scanner.nextLine(); // Clear the scanner buffer
                        System.out.print("Enter PayPal account details: ");
                        String accountDetails = scanner.nextLine();
                        PayPalProcessor payPalProcessor = new PayPalProcessor(accountDetails);
                        System.out.print("Enter payment amount: ");
                        double payPalAmount = scanner.nextDouble();
                        payPalProcessor.processPayment(payPalAmount);
                        break;
                    case 3:
                        scanner.nextLine(); // Clear the scanner buffer
                        System.out.print("Enter Bitcoin wallet details: ");
                        String walletDetails = scanner.nextLine();
                        BitcoinProcessor bitcoinProcessor = new BitcoinProcessor(walletDetails);
                        System.out.print("Enter payment amount: ");
                        double bitcoinAmount = scanner.nextDouble();
                        bitcoinProcessor.processPayment(bitcoinAmount);
                        break;
                    case 4:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 4);
        } catch (PaymentException e) {
            System.out.println("PaymentException: " + e.getMessage());
        }
    }
}