import java.util.Scanner;

public class Paintjob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total square feet to be painted: ");
        int sqrft = scanner.nextInt();

        calculatepaintjob(sqrft);

        scanner.close();
    }

    public static void calculatepaintjob(int sqrft) {
        int gallons_Of_Paint = sqrft / 180;
        int hours_Of_Labor = gallons_Of_Paint * 8;
        int labor_Charges = hours_Of_Labor * 200;
        int total_Cost_Of_Paint = gallons_Of_Paint * 4000;

        System.out.println("Total gallons of paint required: " + gallons_Of_Paint+" gal");
        System.out.println("Hours of labor required: " + hours_Of_Labor+" Pkr");
        System.out.println("Labor charges: " + labor_Charges+" hour");
        System.out.println("Total cost of paint job: " + total_Cost_Of_Paint+" Pkr");
    }
}
