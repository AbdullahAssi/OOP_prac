import java.util.Scanner;
public class Student{
    int id;
    String name;
    String grade;
    Student(int id,String name,String grade){
        this.id=id;
        this.name=name;
        this.grade=grade;   
    }
    public void Display(){
        System.out.println("ID:"+ id +","+" Name:"+name+","+" Grade:"+grade);
        
    }
}