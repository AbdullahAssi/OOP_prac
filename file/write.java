
/**
 * Write a description of class write here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.FileWriter;
import java.io.File;
public class write
{
    public static void main(String [] args){
    try{    FileWriter obj=new FileWriter("filename.txt");
        obj.write("My name is zaineb");
        obj.close();
        System.out.print("Officially Wrriten");
    }
    catch(Exception e){
        System.out.println(e);
    }
}
 }