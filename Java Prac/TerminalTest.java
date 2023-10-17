import java.time.LocalDate;
import java.util.Scanner;
class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Student extends Person {
    public Student(String name, int id) {
        super(name, id);
    }
}

class FacultyMember extends Person {
    public FacultyMember(String name, int id) {
        super(name, id);
    }
}

class Book {
    private int numberOfReferenceBookIssued;
    private int numberOfReferenceBookAvailable;
    private int numberOfTextBookIssued;
    private int numberOfTextBookAvailable;

    public Book(int numberOfReferenceBookIssued, int numberOfReferenceBookAvailable,
                int numberOfTextBookIssued, int numberOfTextBookAvailable) {
        this.numberOfReferenceBookIssued = numberOfReferenceBookIssued;
        this.numberOfReferenceBookAvailable = numberOfReferenceBookAvailable;
        this.numberOfTextBookIssued = numberOfTextBookIssued;
        this.numberOfTextBookAvailable = numberOfTextBookAvailable;
    }

    // Getters and setters
    public int getNumberOfReferenceBookIssued() {
        return numberOfReferenceBookIssued;
    }

    public void setNumberOfReferenceBookIssued(int numberOfReferenceBookIssued) {
        this.numberOfReferenceBookIssued = numberOfReferenceBookIssued;
    }

    public int getNumberOfReferenceBookAvailable() {
        return numberOfReferenceBookAvailable;
    }

    public void setNumberOfReferenceBookAvailable(int numberOfReferenceBookAvailable) {
        this.numberOfReferenceBookAvailable = numberOfReferenceBookAvailable;
    }

    public int getNumberOfTextBookIssued() {
        return numberOfTextBookIssued;
    }

    public void setNumberOfTextBookIssued(int numberOfTextBookIssued) {
        this.numberOfTextBookIssued = numberOfTextBookIssued;
    }

    public int getNumberOfTextBookAvailable() {
        return numberOfTextBookAvailable;
    }

    public void setNumberOfTextBookAvailable(int numberOfTextBookAvailable) {
        this.numberOfTextBookAvailable = numberOfTextBookAvailable;
    }
}

class Library implements LibraryManagementSystem {
    private static final int MAX_STUDENT_BOOKS = 1;
    private static final int MAX_FACULTY_BOOKS = 4;
    private static final int STUDENT_BOOK_DURATION = 30;
    private static final int FACULTY_BOOK_DURATION = 180;
    private static final int STUDENT_FINE_RATE = 20;
    private static final int FACULTY_FINE_RATE = 10;

    private Book book;

    public Library(Book book) {
        this.book = book;
    }

    @Override
    public void issueBook(TypeOfBook typeOfBook) {
        if (typeOfBook == TypeOfBook.TEXTBOOK) {
            if (book.getNumberOfTextBookAvailable() > 0 && book.getNumberOfTextBookIssued() < MAX_STUDENT_BOOKS) {
                book.setNumberOfTextBookAvailable(book.getNumberOfTextBookAvailable() - 1);
                book.setNumberOfTextBookIssued(book.getNumberOfTextBookIssued() + 1);
                System.out.println("Textbook issued to student.");
            } else {
                System.out.println("No textbooks available or student has reached the maximum limit.");
            }
        } else if (typeOfBook == TypeOfBook.REFERENCEBOOK) {
            if (book.getNumberOfReferenceBookAvailable() > 0 && book.getNumberOfReferenceBookIssued() < MAX_FACULTY_BOOKS) {
                book.setNumberOfReferenceBookAvailable(book.getNumberOfReferenceBookAvailable() - 1);
                book.setNumberOfReferenceBookIssued(book.getNumberOfReferenceBookIssued() + 1);
                System.out.println("Reference book issued to faculty member.");
            } else {
                System.out.println("No reference books available or faculty member has reached the maximum limit.");
            }
        }
    }

    @Override
    public void returnBook(TypeOfBook typeOfBook) {
        if (typeOfBook == TypeOfBook.TEXTBOOK) {
            if (book.getNumberOfTextBookIssued() > 0) {
                book.setNumberOfTextBookIssued(book.getNumberOfTextBookIssued() - 1);
                book.setNumberOfTextBookAvailable(book.getNumberOfTextBookAvailable() + 1);
                System.out.println("Textbook returned.");
            } else {
                System.out.println("No textbooks issued to return.");
            }
        } else if (typeOfBook == TypeOfBook.REFERENCEBOOK) {
            if (book.getNumberOfReferenceBookIssued() > 0) {
                book.setNumberOfReferenceBookIssued(book.getNumberOfReferenceBookIssued() - 1);
                book.setNumberOfReferenceBookAvailable(book.getNumberOfReferenceBookAvailable() + 1);
                System.out.println("Reference book returned.");
            } else {
                System.out.println("No reference books issued to return.");
            }
        }
    }

    @Override
    public int calculateFine(int numberOfDays) {
        int fine = 0;
        if (numberOfDays > 0) {
            fine = numberOfDays * (book.getNumberOfTextBookIssued() > 0 ? STUDENT_FINE_RATE : FACULTY_FINE_RATE);
        }
        return fine;
    }
}

public class TerminalTest {
        private static Student[] students;
    private static FacultyMember[] facultyMembers;
    private static Book book;
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Book book = new Book(5, 10, 3, 8);
        Library library = new Library(book);
        Student[] students = {
                new Student("John", 1),
                new Student("Jane", 2),
                new Student("David", 3),
                new Student("Emma", 4),
                new Student("Michael", 5)
        };

        FacultyMember[] facultyMembers = {
                new FacultyMember("Dr. Smith", 101),
                new FacultyMember("Prof. Johnson", 102),
                new FacultyMember("Dr. Wilson", 103),
                new FacultyMember("Prof. Thompson", 104),
                new FacultyMember("Dr. Davis", 105)
        };

        // Issue and return books for students
        library.issueBook(TypeOfBook.TEXTBOOK);
        library.returnBook(TypeOfBook.TEXTBOOK);
        library.issueBook(TypeOfBook.TEXTBOOK);
        library.issueBook(TypeOfBook.TEXTBOOK);
        library.issueBook(TypeOfBook.TEXTBOOK);
        library.issueBook(TypeOfBook.TEXTBOOK);
        library.issueBook(TypeOfBook.TEXTBOOK); // This should show the maximum limit reached message
        library.returnBook(TypeOfBook.TEXTBOOK);
        library.returnBook(TypeOfBook.TEXTBOOK);

        // Issue and return books for faculty members
        library.issueBook(TypeOfBook.REFERENCEBOOK);
        library.issueBook(TypeOfBook.REFERENCEBOOK);
        library.issueBook(TypeOfBook.REFERENCEBOOK);
        library.issueBook(TypeOfBook.REFERENCEBOOK);
        library.returnBook(TypeOfBook.REFERENCEBOOK);
        library.issueBook(TypeOfBook.REFERENCEBOOK);
        library.issueBook(TypeOfBook.REFERENCEBOOK); // This should show the maximum limit reached message
        library.returnBook(TypeOfBook.REFERENCEBOOK);
        library.returnBook(TypeOfBook.REFERENCEBOOK);

        // Display menu
        System.out.println("Menu:");
        System.out.println("1. Enter 1 to display data of students along with their fine");
        System.out.println("2. Enter 2 to display data of faculty members along with their fine");
        System.out.println("3. Enter 3 to display the number of available books");
        System.out.println("4. Enter 4 to display the number of issued books");

        int choice = 1;

        try {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice. Please enter a number.");
        }

        switch (choice) {
            case 1:
                displayStudentsWithFine(students, library);
                break;
            case 2:
                displayFacultyMembersWithFine(facultyMembers, library);
                break;
            case 3:
                displayAvailableBooks(book);
                break;
            case 4:
                displayIssuedBooks(book);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    private static void displayStudentsWithFine(Student[] students, Library library) {
        System.out.println("Student Data:");
        for (Student student : students) {
            int fine = library.calculateFine(0); // Assuming zero days overdue for simplicity
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId() + ", Fine: Rs. " + fine);
        }
    }

    private static void displayFacultyMembersWithFine(FacultyMember[] facultyMembers, Library library) {
        System.out.println("Faculty Member Data:");
        for (FacultyMember facultyMember : facultyMembers) {
            int fine = library.calculateFine(0); // Assuming zero days overdue for simplicity
            System.out.println("Name: " + facultyMember.getName() + ", ID: " + facultyMember.getId() + ", Fine: Rs. " + fine);
        }
    }

    private static void displayAvailableBooks(Book book) {
        int availableTextBooks = book.getNumberOfTextBookAvailable();
        int availableReferenceBooks = book.getNumberOfReferenceBookAvailable();

        System.out.println("Number of available books:");
        System.out.println("Textbooks: " + availableTextBooks);
        System.out.println("Reference books: " + availableReferenceBooks);
    }

    private static void displayIssuedBooks(Book book) {
        int issuedTextBooks = book.getNumberOfTextBookIssued();
        int issuedReferenceBooks = book.getNumberOfReferenceBookIssued();

        System.out.println("Number of issued books:");
        System.out.println("Textbooks: " + issuedTextBooks);
        System.out.println("Reference books: " + issuedReferenceBooks);
    }
}
