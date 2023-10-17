class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvancedMathOperations extends MathOperations {
    // Overriding the add method to handle double values
    @Override
    public int add(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math1 = new MathOperations();
        System.out.println(math1.add(5, 10)); // Output: 15 (from the superclass)

        AdvancedMathOperations math2 = new AdvancedMathOperations();
        System.out.println(math2.add(5, 10)); // Output: 50 (from the subclass)
    }
}
