import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class read{
    public static void man(String args[]){
        try{
            FileWriter writer=new FileWriter("ZAINEB.txt");
            writer.write("\nI love you");
            writer.write("\nI Hate you");
            writer.close();
            
            FileReader read=new FileReader("ZAINEB.txt");
            Scanner obj=new Scanner(read);
            while(obj.hasNextLine()){
                String data=obj.nextLine();
                System.out.println(data);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}