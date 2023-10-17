public class a extends Marks{
    private double res;
    private double a;
    private double b;
    private double c;
    
     public a (int a,int b,int c){
         this.a = a;
         this.b =b;
         this.c =c;
     }
    
    
    public double getParcentage(double a, double b ,double c){
        res = (a+b+c)/300*100;
        return res;
    }
}