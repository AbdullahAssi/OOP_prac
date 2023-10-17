public class Circle implements MyShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }
}
