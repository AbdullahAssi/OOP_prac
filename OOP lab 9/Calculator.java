public class Calculator {
    public int divide(int numerator, int denominator) {
        try {
            if (denominator == 0) {
                throw new ArithmeticException();
            } else {
                return numerator / denominator;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}
