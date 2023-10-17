import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generating random integers
        int randomNumber1 = random.nextInt(100); // Generates a random integer between 0 (inclusive) and 100 (exclusive)
        int randomNumber2 = random.nextInt(100); // Generates another random integer between 0 (inclusive) and 100 (exclusive)

        // Generating random double value
        double randomDouble = random.nextDouble(); // Generates a random double between 0.0 (inclusive) and 1.0 (exclusive)

        // Printing the random numbers
        System.out.println("Random Integer 1: " + randomNumber1);
        System.out.println("Random Integer 2: " + randomNumber2);
        System.out.println("Random Double: " + randomDouble);
    }
}
