import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative. Setting age to 0.");
            this.age = 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person = new Person();

        // Taking input from the user for name
        System.out.print("Enter name: ");
        String name = input.nextLine();
        person.setName(name);

        // Taking input from the user for age
        System.out.print("Enter age: ");
        int age = input.nextInt();
        person.setAge(age);

        // Accessing the name and age using the getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Closing the Scanner
        input.close();
    }
}
