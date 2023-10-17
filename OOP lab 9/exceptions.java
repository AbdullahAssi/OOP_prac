public class exceptions{
    public static void main(String[]args){
        try{
            int [] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("This part must run");
        }
    }
}