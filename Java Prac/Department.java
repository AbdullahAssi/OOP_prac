public class Department {
    // Data members
    private int departmentId;
    private String departmentName;
    private boolean isActive;

    // Constructors
    // a. Default Constructor
    public Department() {
        // Initialize default values
        departmentId = 0;
        departmentName = "Unknown";
        isActive = true;
    }

    // b. Parameterized Constructor
    public Department(int departmentId, String departmentName, boolean isActive) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.isActive = isActive;
    }

    // c. Private Constructor
    private Department(int departmentId) {
        // This constructor can only be called from within the class
        this.departmentId = departmentId;
        departmentName = "Private Department";
        isActive = false;
    }

    // d. Copy Constructor
    public Department(Department other) {
        // Creates a new object with the same values as 'other'
        this.departmentId = other.departmentId;
        this.departmentName = other.departmentName;
        this.isActive = other.isActive;
    }

    // Methods
    // a. Display data member values
    public void displayData() {
        System.out.println("Department ID: " + departmentId);
        System.out.println("Department Name: " + departmentName);
        System.out.println("Active: " + isActive);
    }

    // b. Return a value
    public String getDepartmentName() {
        return departmentName;
    }

    // c. Your own choice (method to check if the department is active)
    public boolean isDepartmentActive() {
        return isActive;
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        Department defaultDepartment = new Department(); // Default Constructor
        Department parameterizedDepartment = new Department(101, "Sales", true); // Parameterized Constructor
        Department privateDepartment = new Department(102); // Private Constructor (called internally)
        Department copyDepartment = new Department(parameterizedDepartment); // Copy Constructor

        // Display values of instance variables
        System.out.println("Default Department:");
        defaultDepartment.displayData();
        System.out.println();

        System.out.println("Parameterized Department:");
        parameterizedDepartment.displayData();
        System.out.println();

        System.out.println("Private Department:");
        privateDepartment.displayData();
        System.out.println();

        System.out.println("Copy Department:");
        copyDepartment.displayData();
        System.out.println();

        // Call all three methods for each object
        System.out.println("Calling methods for Default Department:");
        System.out.println("Department Name: " + defaultDepartment.getDepartmentName());
        System.out.println("Is Department Active? " + defaultDepartment.isDepartmentActive());
        System.out.println();

        System.out.println("Calling methods for Parameterized Department:");
        System.out.println("Department Name: " + parameterizedDepartment.getDepartmentName());
        System.out.println("Is Department Active? " + parameterizedDepartment.isDepartmentActive());
        System.out.println();

        System.out.println("Calling methods for Private Department:");
        System.out.println("Department Name: " + privateDepartment.getDepartmentName());
        System.out.println("Is Department Active? " + privateDepartment.isDepartmentActive());
        System.out.println();

        System.out.println("Calling methods for Copy Department:");
        System.out.println("Department Name: " + copyDepartment.getDepartmentName());
        System.out.println("Is Department Active? " + copyDepartment.isDepartmentActive());
        System.out.println();
    }
}
