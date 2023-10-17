
import java.io.*;
 
public class Exercise16 {
     public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "ZAINEB.txt";
             FileWriter fw = new FileWriter(filename,true); 
             //appends the string to the file
             fw.write("Java Exercises\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("ZAINEB.txt"));
             //read the file content
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
           }
           catch(Exception e)
           {
            System.err.println("IOException: " + e);
           }
        }
  }
