
public class First
{
    public static void main(String[]args){
     
    /** Task 1 **/
        
    String Name = "Muhammad Abdullah";
    String ID = "F22607010";
    String Degree = "Artificial Intelligence";
    String Courses ="Linear algebra, Statics, Database System , Object Oriented Programming";
    System.out.println("Name:"+Name+"\n"+"Id:"+ID+"\n"+"Degree:"+Degree+"\n"+"Courses:"+Courses+"\n\n");
    
    /** Task 2 **/
    
    int cent = 58;
    double feet = cent* 0.0328;
    System.out.println("58 CM in feet is : "+feet +" feet");
    
    double inc = cent* 0.393;
    System.out.println("58 CM = "+inc+ " Inches\n\n");
    
    
    /** Task 3 **/
    int weight = 75;
    double calories = weight * 19;
    System.out.println("The calories Person needs in a day are: "+calories+"\n\n");
    
    
    
    /** Task 4 **/
    
    char alphabet = 't';
    System.out.println(" Using Switch Statment");
    switch(alphabet){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            System.out.println("Alphabet " + alphabet+ "is vowel");
            break;
        default:
            System.out.println("Alphabet '" + alphabet+ "' is constant");
    }
    alphabet = 'I';
    System.out.println(" Using if else statment");
    if((alphabet == 'a') || (alphabet == 'e') || (alphabet == 'i') || (alphabet == 'o') || (alphabet == 'u')|| (alphabet == 'A') || (alphabet == 'E') || (alphabet == 'I') || (alphabet == 'O') || (alphabet == 'U'))
    System.out.println("Alphabet "+alphabet+" is vowel \n");
    else 
    System.out.println("Alphabet '" +alphabet+ "' is constant\n");
    
    /** Task 5 **/
    
    int weit = 70;
    int height =174;
    
    double BMI = weit/Math.pow(height/100.0 ,2);
    if(BMI<18.5)
    {
        System.out.println("Your are under weight.");
    }
    else if(BMI<25){
        System.out.println("Your weight is normal");
    }
    else if(BMI<30){
        System.out.println("Your are over weight");
    }
    else{
        System.out.println("You are obese");
    }
    System.out.println("The BMI of the body is: "+BMI);
   
    
    
    /** Task 6 **/
    String namec = "Abdullah";
    String names = "abdullah";
    System.out.println("\n String 1: "+ namec);
    System.out.println("String 2:"  + names);
    if( namec == names)
        System.out.println("Both Strings are equal");
    else
        System.out.println("Both String are not equal");
    }
}
