import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReaD_Write {
    public static void main(String[] args) {
        try {
            //Writing
            FileWriter myWriter = new FileWriter("ZOHAIB.txt");
            myWriter.write("Hello World!\n");
            myWriter.write("My name is Zohaib Afzaal\n");
            myWriter.close();
           
            //Reading
            File myObj = new File("ZOHAIB.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}