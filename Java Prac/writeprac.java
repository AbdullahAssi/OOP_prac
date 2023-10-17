import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class writeprac{
    public static void main(String[]args){
        try{
            Scanner input = new Scanner(System.in);
            FileWriter obj = new FileWriter("WritePrac.txt",true);
            
            
            boolean quite = false;
            while(!quite){
                     System.out.println("Menu:");
                    System.out.println("1. Write to file");
                    System.out.println("2. Quit");
                    System.out.print("Enter your choice: ");
                    int choice = input.nextInt();
                    input.nextLine();
                    
                    if(choice ==1){
                        System.out.println("Enter a line to write: ");
                        String line = input.nextLine();
                        obj.write(line);
                        obj.write("\n");
                       
                    }
                    else if (choice ==2){
                        quite = true;
                    }
                    else{
                        System.out.println("Invalid choice enter again");
                    }
            }
            obj.close();
            input.close();
            System.out.println("File written successfully\n\n");
            System.out.println("Written text is below" );
            
            File obj1 = new File("WritePrac.txt");
            Scanner reader = new Scanner(obj1);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}