
public class Person{
    String name;
    String Address;
    String p_num;
    String e_mail;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
     public void setAddress(String Address){
        this.Address = Address;
    }
    public String getAddress(){
        return Address;
    }
    public void setPhone(String p_num){
        this.p_num = p_num;
    }
    
    public String getPhone(){
        return p_num;
    }
    public void setEmail(String e_mail){
        this.e_mail = e_mail;
    }
    public String getEmail(){
        return e_mail;
    }
    
    public Person(String name, String Address, String p_num, String e_mail){
        this.name = name;
        this.Address = Address;
        this.p_num = p_num;
        this.e_mail = e_mail;
    }
    
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Address: "+Address);
        System.out.println("Phone Number: "+p_num);
        System.out.println("Email Address: "+e_mail);
    }
    
    public static void main (String[]args){
        
        Person person = new Person("Abdullah Assi", "Dunyapur", "123-456-7890", "assi225@gmail.com");
        person.display();
        System.out.println();

        Student student = new Student("Moeez Ahmed", "Pak Pattan", "1234.590", "moeez@gmail.com", "Senior");
        student.display();
        System.out.println();

        Employee employee = new Employee("Zohaib", "Dina", "123-456-7890", "zohaib@gmail.com", "Office 101", 50000, "15-04-23");
        employee.display();
        System.out.println();

        Faculty faculty = new Faculty("Sultan Mehmood", "Liyyah", "123-456-7890", "Sultan@gmail.com", "Office 202", 60000, "15-04-23", "9 AM - 5 PM", "Professor");
        faculty.display();
        System.out.println();

        Staff staff = new Staff("Zeeshan", "Multan", "123-456-7890", "zeeshan@gmail.com", "Office 303", 40000, "15-04-23", "Manager");
        staff.display(); 
        }
    }
    

    