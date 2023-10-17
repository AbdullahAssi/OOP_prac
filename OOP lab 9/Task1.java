import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }

        try {
            double R = Math.sqrt(num);
            System.out.println("The square root of " + num + " is " + R);
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}

