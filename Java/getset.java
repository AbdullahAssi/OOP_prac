import java.util.Scanner;

class employee{
    private int id;
    private String name;
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int i){
        id = i;
    }
}


class Addition{
    private int num1;
    private int num2;
    int result;

    public int getnum1(){
        return num1;
    }
    public void setnum1(int n1){
        num1 = n1;
    }
    public int getnum2(){
        return num2;
    }
    public void setnum2(int n2){
        num2 = n2;
    }
    public int result(){
        return result=num1+num2;
    }
}

public class getset{
    public static void main(String[]args){
        employee obj1 = new employee();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter Your name: ");
        String name = sc.nextLine();
        obj1.setName(name);
        System.out.println("Your name is : " + name);
        
        
        System.out.println("Enter Your id ");
        int x =sc.nextInt();
        obj1.setID (x);
        System.out.println("Enter Your id "+x);
        
        
        System.out.println(obj1.getID());
        
        
        Addition obj2 = new Addition();
        obj2.setnum1(10);
        System.out.println(obj2.getnum1());
        obj2.setnum2(20);
        System.out.println(obj2.getnum2());
        System.out.println("The addition of the above mentioned two numbers is "+obj2.result());
    }
}



