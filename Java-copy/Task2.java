abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private double sub1;
    private double sub2;
    private double sub3;

    public A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    public double getPercentage() {
        double totalMarks = sub1 + sub2 + sub3;
        return (totalMarks / 300) * 100;
    }
}

class B extends Marks {
    private double sub1;
    private double sub2;
    private double sub3;
    private double sub4;

    public B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    public double getPercentage() {
        double totalMarks = sub1 + sub2 + sub3 + sub4;
        return (totalMarks / 400) * 100;
    }
}

public class Task2{
    public static void main(String[] args) {
        A studentA = new A(50, 60, 75);
        B studentB = new B(80, 75, 95, 99);

        System.out.println("Percentage of marks obtained by Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks obtained by Student B: " + studentB.getPercentage() + "%");
    }
}
