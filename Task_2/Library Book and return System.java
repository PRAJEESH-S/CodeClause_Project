import java.util.*;
class Library 
{
    String bookName, author;
    int bookId;
    boolean issued;
    
    Scanner sc = new Scanner(System.in);
    void addBook() 
    {
        System.out.print("Enter Book ID : ");
        bookId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Name : ");
        bookName = sc.nextLine();
        System.out.print("Enter Author Name : ");
        author = sc.nextLine();
        issued = false;
        System.out.println("Book added successfully!");
    }
    void issueBook() 
    {
        if (issued) 
        {
            System.out.println("Book already issued !");
        } 
        else 
        {
            System.out.print("Enter Student Name: ");
            String studentName = sc.nextLine();
            System.out.print("Enter Student ID: ");
            int studentId = sc.nextInt();
            issued = true;
            System.out.println("Book issued to " + studentName + " (ID: " + studentId + ")");
        }
    }
    void returnBook() 
    {
        if (issued) 
        {
            issued = false;
            System.out.println("Book returned successfully !");
        } 
        else 
        {
            System.out.println("Book not issued yet!");
        }
    }
    void displayBookDetails() 
    {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + author);
        System.out.println("Book Status: " + (issued ? "Issued" : "Available"));
    }
}

public class Library Book and return System
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Library book = new Library();
        while (true) 
        {
            System.out.println("\nLibrary Book Issue and Return System");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Book Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5) : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) 
            {
                case 1:
                    book.addBook();
                    break;
                case 2:
                    book.issueBook();
                    break;
                case 3:
                    book.returnBook();
                    break;
                case 4:
                    book.displayBookDetails();
                    break;
                case 5:
                    System.out.println("Thank You ! Visit Again");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
