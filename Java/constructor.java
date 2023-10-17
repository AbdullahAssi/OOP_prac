public class constructor{
    int a;
    int b;
    int result;
    String c;
    constructor(int z,int b){
        this.a=z;
        this.b=b;
        result=a*b;
    }
    public int getvalue(){
     return result;
  }
  private constructor(String c){
      this.c=c;
  }
    constructor(String c,int a){
        this.c=c;
        this.a=a;
    }
    constructor(){
       // int c;
        //String a;
    }
    constructor(constructor others){
        this.c=others.c;
        this.a=others.a;
    }
     public void displayInfo() {
        System.out.println("Name: " + this.result);
        System.out.println("Location: " + this.b);
        System.out.println("Number of employees: " + this.c);
    
    //private constructor(){
    }
     public int getNumEmployees() {
        return this.b;
    }
    public static void main(String []main){
        constructor ch= new constructor(67,89);
        constructor ch1= new constructor("I LOVE YOU",87);
        constructor ch2=new constructor("I am private");
        constructor ch3=new constructor();
        constructor ch4=new constructor(ch1);
            ch.displayInfo();
            ch1.displayInfo();
            ch2.displayInfo();
            ch3.displayInfo();
            ch4.displayInfo();
         System.out.println(ch.a+"* "+ch.b+" ="+ch.getvalue());
         System.out.println(ch.getvalue());
         System.out.println(ch1.c+" "+ch1.a);
         System.out.print(ch4.c+" "+ch4.a);
        }
}