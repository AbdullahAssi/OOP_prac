import java.util.Scanner;
public class Task1 {
    static  double kinetic_energy(double M, double V){
        double KE = 0.5*M*V*V;
        return KE;
    }
    public static void main(String[]args){
        Scanner ke = new Scanner(System.in);
        double m , v;
        System.out.println("Enter the Mass of the body in KG: " );
        m = ke.nextDouble();
        System.out.println("Enter the Velocity of the body in MS-1: ");
        v = ke.nextDouble();

        System.out.println("The kinetic energy of the body is: "+ kinetic_energy(m,v));
    }
}
