import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileAppend {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("Zohaib.txt",true); // Set 'append' parameter to true
            myWriter.write("\nMore content added to the file."); // Append new content
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
