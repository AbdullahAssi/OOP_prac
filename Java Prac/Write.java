import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Write {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            FileWriter obj1 = new FileWriter("Writer.txt");

            boolean quit = false;
            while (!quit) {
                System.out.println("Menu:");
                System.out.println("1. Write to file");
                System.out.println("2. Quit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter text to write: ");
                        String text = input.nextLine();
                        obj1.write(text);
                        obj1.write("\n");
                        break;
                    case 2:
                        quit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }

            obj1.close();
            input.close();

            File obj = new File("Writer.txt");
            Scanner reader = new Scanner(obj);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

            System.out.println("Program finished. Text successfully written to the file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
