import java.util.Scanner;

class arr2 {
    int age;
    String name;

    public arr2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Age of the student: " + age);
        System.out.println("Name of the student: " + name);
    }
}

public class arr {
    public static void main(String[] args) {
        arr2[] obj = new arr2[3];
        Scanner input = new Scanner(System.in);

        obj[0] = new arr2(8, "Abdullah");
        obj[1] = new arr2(10, "Zohaib");
        obj[2] = new arr2(12, "Mehdi");

        System.out.println("Displaying all students:");
        for (int a = 0; a < 3; a++) {
            obj[a].display();
        }

        System.out.println("Enter an age to search:");
        int searchAge = input.nextInt();

        boolean found = false;
        for (int a = 0; a < 3; a++) {
            if (obj[a].age == searchAge) {
                obj[a].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student with age " + searchAge + " not found.");
        }
    }
}
