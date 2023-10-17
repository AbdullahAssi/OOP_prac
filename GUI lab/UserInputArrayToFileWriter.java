import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputArrayToFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] stringArray = new String[numElements];
        int[] intArray = new int[numElements];
        double[] doubleArray = new double[numElements];

        System.out.println("Enter the elements of the String array:");
        for (int i = 0; i < numElements; i++) {
            stringArray[i] = scanner.nextLine();
        }

        System.out.println("Enter the elements of the Integer array:");
        for (int i = 0; i < numElements; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the Double array:");
        for (int i = 0; i < numElements; i++) {
            doubleArray[i] = scanner.nextDouble();
        }

        try {
            FileWriter writer = new FileWriter("output.txt");

            for (int i = 0; i < numElements; i++) {
                writer.write(String.format("%-30s %-10d %-10f%n", stringArray[i], intArray[i], doubleArray[i]));
            }

            writer.close();
            System.out.println("Data written to the file successfully.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }
    }
}
