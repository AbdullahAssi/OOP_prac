import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class search {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            FileWriter obj = new FileWriter("WritePrac.txt", true);

            boolean quit = false;
            while (!quit) {
                System.out.println("Menu:");
                System.out.println("1. Write to file");
                System.out.println("2. Search word in file");
                System.out.println("3. Quit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine();

                if (choice == 1) {
                    System.out.println("Enter a line to write: ");
                    String line = input.nextLine();
                    obj.write(line);
                    obj.write("\n");
                } else if (choice == 2) {
                    System.out.println("Enter the word to search: ");
                    String wordToSearch = input.nextLine();

                    File file = new File("WritePrac.txt");
                    Scanner reader = new Scanner(file);

                    boolean wordFound = false;
                    while (reader.hasNextLine()) {
                        String line = reader.nextLine();
                        if (line.contains(wordToSearch)) {
                            wordFound = true;
                            System.out.println("Word found in the following line:");
                            System.out.println(line);
                        }
                    }
                    if (!wordFound) {
                        System.out.println("Word not found in the file.");
                    }
                    reader.close();
                } else if (choice == 3) {
                    quit = true;
                } else {
                    System.out.println("Invalid choice, enter again");
                }
            }

            obj.close();
            input.close();
            System.out.println("File written successfully\n\n");
            System.out.println("Written text is below");

            File obj1 = new File("WritePrac.txt");
            Scanner reader = new Scanner(obj1);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
