
public class main
{

    public static void main(String[]args){
        Book obj1 = new Book();
        
        obj1.setbookID(1);
        System.out.println("Book id:"+obj1.getbookID());
        
        obj1.setpages(10);
        System.out.println("Book Pages:"+obj1.getpages());
        
        obj1.setprice(6000);
        System.out.println("Book Price"+obj1.getprice());
        
    }
}
