import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Manageable {
    void addRecord();
    void displayRecords();
    void deleteRecord();
    void searchRecord();
}

class Book implements Manageable, Serializable {
    private String title;
    private String author;
    private int year;

    Book() {
    }

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void addRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title: ");
        title = scanner.nextLine();
        System.out.print("Enter author name: ");
        author = scanner.nextLine();
        System.out.print("Enter publication year: ");
        year = scanner.nextInt();
    }

    @Override
    public void displayRecords() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + year);
        System.out.println();
    }

    @Override
    public void deleteRecord() {
        title = "";
        author = "";
        year = 0;
    }

    @Override
    public void searchRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title to search: ");
        String searchTitle = scanner.nextLine();

        if (title.equalsIgnoreCase(searchTitle)) {
            displayRecords();
        } else {
            System.out.println("Book not found.");
        }
    }

    String getTitle() {
        return title;
    }

    // Method to convert the book data to the custom format
    String toFormattedString() {
        return "Book Title: " + title + "\nAuthor: " + author + "\nPublication Year: " + year;
    }

    // Method to create a Book object from the custom format string
    static Book fromFormattedString(String formattedString) {
        String[] lines = formattedString.split("\n");
        String title = lines[0].replace("Book Title: ", "");
        String author = lines[1].replace("Author: ", "");
        int year = Integer.parseInt(lines[2].replace("Publication Year: ", ""));
        return new Book(title, author, year);
    }
}

class FileManager {
   private static final String FILE_NAME = "library_records.txt";

    void saveToFile(List<Book> books) {
        try (FileWriter fileWriter = new FileWriter(FILE_NAME,true)) {
            for (Book book : books) {
                fileWriter.write(book.toFormattedString() + "\n");
            }
            System.out.println("Data saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data to file: " + e.getMessage());
        }
    }

    List<Book> loadFromFile() {
        List<Book> books = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            books = (ArrayList<Book>) inputStream.readObject();
            System.out.println("Data loaded from file successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data from file: " + e.getMessage());
        }
        return books;
    }
}


class Library {
    private List<Book> books;
    private FileManager fileManager;

    Library() {
        books = new ArrayList<>();
        fileManager = new FileManager();
    }

    void addRecord() {
        Book book = new Book("", "", 0);
        book.addRecord();
        books.add(book);
        System.out.println("Book added successfully.");
    }

    void displayRecords() {
        if (books.isEmpty()) {
            System.out.println("No books found in the library.");
        } else {
            for (Book book : books) {
                book.displayRecords();
            }
        }
    }

    void deleteRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title to delete: ");
        String deleteTitle = scanner.nextLine();

        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(deleteTitle)) {
                books.remove(book);
                found = true;
                System.out.println("Book deleted successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    void searchRecord() {
        if (books.isEmpty()) {
            System.out.println("No books found in the library.");
        } else {
            for (Book book : books) {
                book.searchRecord();
            }
        }
    }

    void saveToFile() {
        fileManager.saveToFile(books);
    }

    void loadFromFile() {
        books = fileManager.loadFromFile();
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.loadFromFile();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("====== Library Management System Menu ======");
            System.out.println("1. Add Book Record");
            System.out.println("2. Display Book Records");
            System.out.println("3. Delete Book Record");
            System.out.println("4. Search Book Record");
            System.out.println("5. Save Records to File");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    library.addRecord();
                    break;
                case 2:
                    library.displayRecords();
                    break;
                case 3:
                    library.deleteRecord();
                    break;
                case 4:
                    library.searchRecord();
                    break;
                case 5:
                    library.saveToFile();
                    break;
                case 6:
                    library.saveToFile();
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
    }
}
