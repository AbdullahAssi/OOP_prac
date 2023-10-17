import java.io.*;
public class pratice{
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder();
        String a="";
        try{
            String filename="ZAINEB.txt";
            FileWriter obj=new FileWriter(filename,true);
            obj.write("\nI love you");
            obj.close();
            BufferedReader bf=new  BufferedReader(new FileReader("ZAINEB.txt"));
            while (a!= null){
                  sb.append(a);
               // sb.append(System.lineSeparator());
                a = bf.readLine();
                System.out.println(a);
            }
        bf.close();
    }   
           catch(Exception e)
           {
            System.err.println("IOException: " + e);
           }
        }
  }
