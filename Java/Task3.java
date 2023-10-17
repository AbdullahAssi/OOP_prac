
public class Task3 {
    public static void main(String[] args) {
        SavingsAccount obj1 = new SavingsAccount(10000);
        CurrentAccount obj2 = new CurrentAccount(100);

        obj1.deposit(300);
        obj2.withdraw(100);
        System.out.println("Savings Account balance: " + obj1.getBalance()+"Pkr");

        obj2.deposit(10000);
        obj2.withdraw(3000);
        System.out.println("Current Account balance: " + obj2.getBalance()+"Pkr");
    }
}
