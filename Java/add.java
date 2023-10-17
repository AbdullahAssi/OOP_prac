import java.util.Scanner;
class add{
    private int num1;
    private int num2;
    private int res;
    
    
    public void setNum1(int n1){
        num1 = n1;
    }
    public int getNum1(){
        return num1;
    }
    
    public void setNum2(int n2){
        num2 = n2;
    }
    public  int getNum2(){
        return num2;
    }
    
    
    public int Res(){
        return res = num1+num2;
    }
    

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        add obj1 = new add();
        
        System.out.println("Enter your First num :");
        int n1 = sc.nextInt();
        obj1.setNum1(n1);
        
        System.out.println("Enter Your Second num  :");
        int n2 = sc.nextInt();
        obj1.setNum2(n2);
        
        
        obj1.Res();
        System.out.println("Your res is "+obj1.Res());
        
    }

}