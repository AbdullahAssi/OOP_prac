class Student extends Person{
      private String status;

      
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
    
    public Student(String name, String Address, String p_num, String e_mail, String status) {
        super(name, Address, p_num, e_mail);
        this.status = status;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Status: " + status);
    }
}