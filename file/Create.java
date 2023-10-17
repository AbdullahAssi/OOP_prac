import java.io.IOException;
import java.io.File;
public class Create{
public static void main(String [] args){
try{    File obj=new File("ZAINEB.txt");
    if(obj.createNewFile()){
        System.out.println("File Created");
    }
    else{
        System.out.print("File Creation Failed:");
    }
} catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}}