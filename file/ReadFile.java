import java.io.File;
import java.util.Scanner;
public class ReadFile {
public static void main(String[] args) {
try {
File myObj = new File("filename.txt");
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()){
String data = myReader.nextLine();
System.out.println(data);}
myReader.close(); }
catch (Exception e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}
}