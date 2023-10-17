public class Square implements MyShape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double Perimeter() {
        return 4 * sideLength;
    }

    public double Area() {
        return sideLength * sideLength;
    }
}
