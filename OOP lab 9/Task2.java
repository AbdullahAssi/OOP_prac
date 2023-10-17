import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        try {
            checkEvenNumber(num);
            System.out.println(num + " is an even number.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void checkEvenNumber(int num) {
        if (num % 2 != 0) {
            throw new IllegalArgumentException("\n"+ num + " is an odd number.");
        }
    }
}
