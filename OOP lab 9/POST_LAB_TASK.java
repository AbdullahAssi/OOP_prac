import java.util.Scanner;

public class POST_LAB_TASK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] obj1 = new Student[3];
        obj1[0] = new Student(1, "Abdullah", "A+");
        obj1[1] = new Student(2, "Sultan", "A");
        obj1[2] = new Student(3, "Zohaib", "B+");

        char again;

        do {
            try {
                System.out.println("Enter the operation you want to perform:");
                System.out.println("1. Add a student");
                System.out.println("2. Remove a student");
                System.out.println("3. Find a student");
                System.out.println("4. Display all students");
                int operation = sc.nextInt();

                if (operation == 3) {
                    System.out.println("Enter the ID you want to find:");
                    int op = sc.nextInt();
                    for (Student student : obj1) {
                        if (student.id == op) {
                            student.Display();
                            break;
                        }
                    }
                } 
                
                else if (operation == 4) {
                    for (Student student : obj1)
                        student.Display();
                } 
                else if (operation == 1) {
                    System.out.println("Enter id:");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter name:");
                    String nm = sc.nextLine();
                    System.out.println("Enter Grade:");
                    String gr = sc.nextLine();

                    System.out.println("Previous Students:");
                    for (Student student : obj1) {
                        student.Display();
                    }

                    System.out.println("New Student:");
                    System.out.println("ID: " + a + ", Name: " + nm + ", Grade: " + gr);
                }
                else if (operation == 2) {
                    try {
                        System.out.println("Enter the ID of the student to remove:");
                        int R_id = sc.nextInt();
                        boolean found = false;
                        for (int i = 0; i < obj1.length; i++) {
                            if (obj1[i].id == R_id) {
                                found = true;
                                obj1[i] = null; // Remove the student by setting the array element to null
                                break;
                            }
                        }
                        
                        if (found) {
                            System.out.println("Student with ID " + R_id + " has been removed.");
                        } else {
                            System.out.println("No student found with ID: " + R_id);
                        }

                        System.out.println("Remaining IDs:");
                        for (Student student : obj1) {
                            if (student != null) {
                                student.Display();
                            }
                        }
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid ID.");
                    }
                }

                System.out.print("Do you want to perform another operation? (y/n) ");
                again = sc.next().charAt(0);

            } catch (Exception e) {
                System.out.println(e);
                again = 'n';
            }

        } while (again == 'y' || again == 'Y');
    }
}
