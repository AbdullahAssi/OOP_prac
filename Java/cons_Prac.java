import java.util.Scanner;
class stud{
    String s_name;
    int s_id;
    
    public stud(String s_n, int sid){
        s_name = s_n;
        s_id = sid;
    }
}
public class cons_Prac{
    public static void main(String[]args){
        stud  obj= new stud("Muhammad Abdullah",10);
        
        System.out.print(obj.s_name);
        
        
    }
}