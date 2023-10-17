public class Triangle implements MyShape {
    private double sideLength;

    public Triangle(double sideLength) {
        this.sideLength = sideLength;
    }

    public double Perimeter() {
        return 3 * sideLength;
    }

    public double Area() {
        return 0.5 * sideLength * sideLength;
    }
}
