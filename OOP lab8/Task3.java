import java.util.Scanner;

public class Task3
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char again;

        do {
            System.out.println("Select a shape:");
            System.out.println("1. Square");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");

            int choice = sc.nextInt();

            System.out.print("Enter the dimension: ");
            double dimension = sc.nextDouble();

            MyShape obj1 = null;  //Initializing the shape variable to null, indicating that it currently does not refer to any specific shape object. 
                                    //As we will assign value to shape through if else according to users choice

             if (choice == 1) {
               obj1= new Square(dimension);
            }
            else if (choice == 2) {
               obj1= new Triangle(dimension);
            } 
            else if (choice == 3) {
               obj1= new Circle(dimension);
            } 
            else {
                System.out.println("Invalid choice.");
            }

            
            // Performs perimeter and area calculations only if a valid shape object has been assigned to the obj1.
            if (obj1 != null) {
                double perimeter = obj1.Perimeter();
                double area = obj1.Area();
                System.out.println("Perimeter of the Shape: " + perimeter);
                System.out.println("Area of the Shape: " + area);
            }

            System.out.print("\n\nDo you want to perform calculations for another Shape? (y/n): ");
            again = sc.next().charAt(0);
        } 
        while (again != 'n' && again != 'N');
        
        System.out.println("\n\nGoodbye! Thank you for using the Shape Calculator.");
    }
}
