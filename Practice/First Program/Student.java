public class Student {
    private String name;
    private int regNo;
    private  String batchNo;
    private  String deptName;
    private double course1, course2, course3, course4, course5;

    public void set(String name, int regNo,String batchNo, String deptName, double course1, double course2, double course3, double course4, double course5) {
        this.name = name;
        this.regNo = regNo;
        this.batchNo = batchNo;
        this.deptName = deptName;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
        this.course5 = course5;
    }

    public void get() {
        System.out.println("Name: " + name);
        System.out.println("Registration No: " + regNo);
        System.out.println("Batch No: " + batchNo);
        System.out.println("Department Name: " + deptName);
        System.out.println("Course 1: " + course1);
        System.out.println("Course 2: " + course2);
        System.out.println("Course 3: " + course3);
        System.out.println("Course 4: " + course4);
        System.out.println("Course 5: " + course5);
    }

    public double calculatePercentage() {
        double totalMarks = course1 + course2 + course3 + course4 + course5;
        return (totalMarks / 500) * 100;
    }
   
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.set("Muhammad Abdullah", 22607010,"AI2022" , "CS", 70, 90, 95, 92, 93);
        student1.get();
        System.out.println("Percentage: " + student1.calculatePercentage() + "%");
    }

}
