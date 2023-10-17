public class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 10));                 // Output: 15
        System.out.println(math.add(5, 10, 15));             // Output: 30
        System.out.println(math.add(2.5, 3.7));             // Output: 6.2
        System.out.println(math.add("Hello, ", "world!"));  // Output: Hello, world!
    }
}
