import java.util.Scanner;
public class Strings {
public static void main(String[] args) {
    String greeting = "Hello World";
    int count = greeting.length();
    System.out.println("Length is : " +greeting.length() );
    String greeting2 = "Hello!";
    greeting2.equals("Hello!");
    greeting2.equals("Bye");
    greeting2.equals("hello");
    System.out.println(greeting2.equals("Hello!"));
    System.out.println(greeting2.equals("Bye"));
    System.out.println(greeting2.equals("hello"));
    String name = "Abdullah";
    name.equalsIgnoreCase("abdullah");
    System.out.println(name.equalsIgnoreCase("abdullah")+ "\n");
    String greeting3 = "ABDULLAH";
    greeting3.toLowerCase();
    System.out.println(greeting3.toLowerCase()+ "\n");
    greeting3 = "m.abdullah";
    greeting3.toUpperCase();
    System.out.println(greeting3.toUpperCase()+ "\n");
    String trim = " Hello ";
    trim.trim();
    System.out.println(trim.trim()+ "\n");
    String greeting4 = "Its Assi";
    greeting4.charAt(4);
    System.out.println(greeting4.charAt(4)+ "\n");
    greeting = "Analog guy in digital world";
    greeting.substring(2);
    System.out.println(greeting.substring(2)+ "\n");
    greeting = "Analog guy in digital world";
    greeting.substring(2,15);
    System.out.println(greeting.substring(2,15)+ "\n");
    greeting = "Index Testing";
    greeting.indexOf("test");
    
    System.out.println(greeting.indexOf("test")+ "\n");
    greeting = "Index Testing";
    greeting.indexOf("Testing", 2);
    System.out.println(greeting.indexOf("test" , 2)+ "\n");
    greeting = "Insane";
    greeting.compareTo("Abdullah");
    greeting.compareTo("Insane");
    System.out.println(greeting.compareTo("Abdullah"));
    System.out.println(greeting.compareTo("Insane"));
    greeting = "Insane";
    greeting.compareToIgnoreCase("Abdullah");
    greeting.compareToIgnoreCase("Insane");
    System.out.println(greeting.compareToIgnoreCase("Abdullah"));
    System.out.println(greeting.compareToIgnoreCase("Insane"));
    Scanner scan = new Scanner(System.in);
    String ch;
    System.out.println("Welcome To OOP LAb 2");
    System.out.println("Enter Your Name: ");
    name = scan.nextLine();
    System.out.println("Enter your ID: ");
    String id = scan.nextLine();
    System.out.println("Enter your Course name: ");
    String cs = scan.nextLine();
    System.out.println("Name: " + name+"\n");
    System.out.println("Length of Name is: " + name.length());
    System.out.println("Registration No: " + id);
    System.out.println("Course: " + cs);
    System.out.println("\nEnter Numbers in centimeters: ");
    int cent = scan.nextInt();
    System.out.println("Centimeters in Inches are: "+(cent /
    2.54) + "inches");
    System.out.println("\nEnter Weight In Pounds: ");
    float w8 = scan.nextFloat();
    double cal = w8 * 19;
    
    System.out.println("Daily Calories Needed in a day is : " +
    cal);
    System.out.print("\nEnter an alphabet: ");
    char alphabet = scan.next().toLowerCase().charAt(0);
// Using if-else statements
    
    if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' ||
    
    alphabet == 'o' || alphabet == 'u') {
    System.out.println(alphabet + " is a vowel.");
    } else {
    System.out.println(alphabet + " is a consonant.");
}

    System.out.println("\nEnter Your Weight in Kilograms: ");
    double weight = scan.nextDouble();
    System.out.println("Enter your Height in Centimeters: ");
    double height = scan.nextDouble();
    
    double bmi = (weight / height / height) * 10000;
    
    System.out.println(bmi);
    String result = bmi <= 18.5 ? "Underweight" : bmi <= 24.9 ?
    "Normal weight" : bmi <= 29.9 ? "Overweight" : "Obese";
    System.out.println(result);
    System.out.println("\nEnter the first string:");
    String str1 = scan.next();
    System.out.println("Enter the second string:");
    String str2 = scan.next();
    result = str1.equalsIgnoreCase(str2) ? "The two strings are equal." : "The two strings are not equal.";
    System.out.println(result);
}
}