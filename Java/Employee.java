
class Employee extends Person{
    private String office;
    private double salary;
    private String date_hired;

    public void setOffice(String office){
        this.office =  office;
    }
    public String getOffice(){
        return office;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    
    public Employee(String name, String Address, String p_num, String e_mail, String office, double salary, String date_hired) {
        super(name, Address, p_num, e_mail);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }
    
    @Override
     public void display() {
        super.display();
        System.out.println("Office: " + office);
        System.out.println("Salary: " + salary);
        System.out.println("String Hired: " + date_hired);
    }
}

class Faculty extends Employee{
    private String office_hours;
    private String rank;
      public Faculty(String name, String Address, String p_num, String e_mail, String office, double salary, String date_hired, String office_hours, String rank) {
        super(name, Address, p_num, e_mail, office, salary, date_hired);
        this.office_hours = office_hours;
        this.rank = rank;
    }
    
    public void setOffice_hours(String office_hours){
        this.office_hours = office_hours;
    }
    
    public String getOffice_hours(){
        return office_hours;
    }
    
    public void setRank(String rank){
        this.rank = rank;
    }
    public String getRank(){
        return rank;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Office Hours: " + office_hours);
        System.out.println("Rank: " + rank);
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String Address, String p_num, String e_mail, String office, double salary, String date_hired, String title) {
        super(name, Address, p_num, e_mail, office, salary, date_hired);
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}
