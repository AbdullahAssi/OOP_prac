import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount obj1 = new BankAccount("98110107049631", 10000.0);
        
        char option;
        
        do {
            System.out.println("Logged in as..." + obj1.getAccountNum());
            System.out.println("Current balance: " + obj1.getBalance() + " Pkr");
            System.out.println("\n\nMenu:");
            System.out.println("1. Withdraw money");
            System.out.println("2. Deposit money");
            System.out.println("3. Exit");
            
            option = sc.next().charAt(0);
            
            switch (option) {
                case '1':
                    try {
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        obj1.withdraw(withdrawAmount);
                    } catch (InsufficientFundsException error) {
                        System.out.println(error.getMessage());
                    } catch (InvalidAmountException erroram) {
                        System.out.println(erroram.getMessage());
                    }
                    break;
                    
                    
                case '2':
                    try {
                        System.out.print("Enter the amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        obj1.addMoney(depositAmount);
                    } catch (InvalidAmountException erroram) {
                        System.out.println(erroram.getMessage());
                    }
                    break;
                    
                case '3':
                    System.out.println("Good Bye . Have a nice day!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
            System.out.println();
            
        } while (option != '3');
    }      
}
