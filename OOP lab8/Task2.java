
import java.util.Scanner;
public class Task2
{
    public static void main(String[] args){
        Scanner input1 = new Scanner (System.in);
        Scanner input2 = new Scanner (System.in);
        Book[] book = new Book[5];
        book[0] = new Book("Introduction to Reactjs By Bob Ziroll",2509,25);
        book[1] = new Book("Javscript",1500,15);
        book[2] = new Book("Object Oriented Programming with Java",1445,70);
        book[3] = new Book("Python for Automation",1099,60);
        book[4] = new Book("Path of Front End Developement",900,30);
        
        System.out.println("\nThe Data of Books are Given below: \n\n");
        
       for(int i = 0 ;i <5;i++){
            System.out.println("Book Number : " + (i+1));
            System.out.println("Book Name : " + book[i].getName());
            System.out.println("Book Price : " + book[i].getPrice()+ "Pkr");
            System.out.println("Book Quantity : " + book[i].getQuantity() + "\n");
        }
        
        char again;
        do{
            int choice;
            do{
                System.out.print("Select Book Number: ");
                choice = input2.nextInt();
                System.out.println("\nYou Selected a Book : "+ book[choice].getName());
                System.out.println("The Quantity of " + book[choice].getName() + " is : "+ book[choice].getQuantity());
            }
            while(choice >5 || choice < 1);
            choice = choice - 1;
            
            int choice1;
            do{
                System.out.println("\nMenu :");
                System.out.println("1. Increase the quantity of a book by 10");
                System.out.println("2. Decrease the quantity of a book by 5");
                choice1 = input2.nextInt();
            }
            while(choice1 > 2 || choice1 < 1);
            
            if(choice1==1){
                book[choice].increaseQuantity(10);
                System.out.println("The quantity of book after increasing is: "  + book[choice].getQuantity());
            }
            if(choice1==2){
                book[choice].decreaseQuantity(5);
                System.out.println("The quantity of book after decreasing is: "  + book[choice].getQuantity());
            }
            
            System.out.println("\nDo you want to check menu again (y/n) : ");
            again = input1.next().charAt(0);
        }
        while(again!='n' && again!='N');
          System.out.println("\n\nGoodbye! Thanks for choosing us!.");
    }
}
