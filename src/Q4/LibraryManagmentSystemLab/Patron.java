package Q4.LibraryManagmentSystemLab;
import java.util.ArrayList;

public class Patron {
    private String name;
    private String patronId;
    private ArrayList<Book> checkedOutBooks;

    // TODO: Implement constructor (name, patronId)
    public Patron(String n, String pId) {
        name = n;
        patronId = pId;
        checkedOutBooks = null;
    }

    // Basic getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }

    // TODO: Implement checkInBook(Book book) and checkOutBook(Book book) methods (remove/add book from checkedOutBooks)
    // Don't forget to set the book's checkedOut field to true/false

    public void checkInBook(Book book) {
        checkedOutBooks.remove(checkedOutBooks.indexOf(book));
    }

    public void checkOutBook(Book book) {
        checkedOutBooks.add(book);
    }
}
