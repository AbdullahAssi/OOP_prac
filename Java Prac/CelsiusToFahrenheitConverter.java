import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
    }
}
