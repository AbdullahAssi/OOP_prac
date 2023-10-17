import java.util.Scanner;
public class Task3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator obj1 = new Calculator();

        System.out.print("Enter the numerator: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the denominator: ");
        int num2 = sc.nextInt();

        int res = obj1.divide(num1, num2);
        System.out.println("Result of division(" + num1 + "/" + num2 + "): " + res);
    }
}