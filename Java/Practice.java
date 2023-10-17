import java.util.Scanner;
class employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public String setname(String n){
        return name = n;
    }
}
class uni_details{
    String reg_no;
    String name;
    String Subjects;
    public void uni(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your uni reg  no: " );
        reg_no = sc.nextLine();
        System.out.println("Enter Your uni name: " );
        name = sc.nextLine();
        System.out.println("Enter Your uni subject: " );
        Subjects = sc.nextLine();
        
        System.out.println("Enter Your uni reg_no is : "+ reg_no);
        System.out.println("Enter Your uni name is : "+ name);
        System.out.println("Enter Your uni subject: "+ Subjects );
    }
}

public class Practice{
    int id;
    String name;
    
    public void details(){
        System.out.println("My id is: "+id);
        System.out.println("My name is "+name);
    }
    
    public static void main (String[]args){
        Practice obj1 = new Practice();
        obj1.id =12;
        obj1.name = "Abdullah";
        obj1.details();
        
        
        obj1.id = 14;
        obj1.name = "Moeez";
        obj1.details();
        
        uni_details obj2  = new uni_details();
        
        
        employee abdullah = new employee();
        abdullah.salary = 300;
        System.out.println(abdullah.getsalary());
        abdullah.setname("Muhammad Abdullah");
        System.out.println(abdullah.getname());
        
    }
}
