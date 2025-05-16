package Q4.LibraryManagmentSystemLab;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    /* ========== DO NOT MODIFY (Except data file path) ========== */
    public static ArrayList<Book> loadCatalog() {
        try {
            // Dataset source: https://www.kaggle.com/datasets/saurabhbagchi/books-dataset
            System.out.print("Loading catalog...");
            String path = "LibraryManagementLab/book_catalog.csv";  // Change directory as needed
            Scanner file = new Scanner(new File(path));
            ArrayList<Book> books = new ArrayList<>();
            while (file.hasNextLine()) {
                String[] bookData = file.nextLine().split(";");
                String isbn = bookData[0];
                String title = bookData[1];
                String author = bookData[2];
                Book book = new Book(title, isbn, author);
                books.add(book);
            }
            file.close();
            System.out.println("success.");
            return books;
        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found. Returning empty catalog.");
        }
        return new ArrayList<>();
    }

    // TODO: Implement main program; make a new Library object, load the catalog,
    // add each book from the catalog to the library, then display the menu
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:\n1) Add Patron\t2) Add Book\t3) Remove Book\n4) Checkout Book\n5) Return Book\n6)Search Book\n7) Sear Book Transaction\n8) Exit");
        System.out.print("Enter choice: ");
        int selection = input.nextInt();
        if (selection == 1) {
            System.out.print("Enter name: ");
            String n = input.nextLine();
            System.out.print("Enter ID: ");
            String pId = input.nextLine();

            System.out.println("Patron has been added");
        } else if (selection == 2) {
            System.out.print("Enter ISBN: ");
            String isbn = input.nextLine();
            System.out.print("Enter title: ");
            String title = input.nextLine();

            System.out.println("Book has been added");
        } else if (selection == 3) {
            System.out.print("Enter ISBN: ");
            String isbn = input.nextLine();

            System.out.println("Book has been removed");
        } else if (selection == 4) {
            System.out.print("Enter ISBN: ");
            String isbn = input.nextLine();
            System.out.print("Enter Patron ID: ");
            String pId = input.nextLine();

            System.out.println("Book has been checked out");
        } else if (selection == 5) {
            System.out.print("Enter ISBN: ");
            String isbn = input.nextLine();
            System.out.print("Enter Patron ID: ");
            String pId = input.nextLine();

            System.out.println("Book has been checked in");
        } else if (selection == 6) {
            System.out.print("Enter title: ");
            String title = input.nextLine();

        } else if (selection == 7) {
            System.out.print("Enter ISBN: ");
            String isbn = input.nextLine();

        } else return;
    }
}
