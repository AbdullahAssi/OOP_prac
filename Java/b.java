public class b extends Marks{
    private double res1student;
    private double d;
    private double a;
    private double b;
    private double c;
    
     public b (int a,int b,int c,int d){
         this.a = a;
         this.b =b;
         this.c =c;
         this.d = d;
     }
    
     
    public double getParcentage2student(double a, double b ,double c,double d){
        res1student = (a+b+c+d)/300*100;
        return res1student;
    }
}