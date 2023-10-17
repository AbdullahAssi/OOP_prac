import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Exercise18 {
     public static void main(String [ ] args) throws FileNotFoundException {
              new Exercise18().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {

       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("ZAINEB.txt"));


       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
           }

       }
         System.out.println(longest_word+"\n");
            return longest_word;
            }
}
