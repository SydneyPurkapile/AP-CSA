package Q4.LibraryManagmentSystemLab;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Library implements LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;

    // TODO: Implement the constructor
    public Library(ArrayList<Book> b, ArrayList<Patron> p, ArrayList<Transaction> t) {
        books = b;
        patrons = p;
        transactions = t;
    }

    // Implement interface methods
    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(String isbn) {
        books.remove(books.indexOf(isbn));
    }

    @Override
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    @Override
    public void removePatron(String patronId) {
        patrons.remove(patrons.indexOf(patronId));
    }

    @Override
    public void createTransaction(String isbn, String patronId, String checkoutDate) {

    }

    @Override
    public void updateTransaction(String isbn, String patronId, String returnDate) {

    }

    // Other methods...
    @Override
    public void viewMostRecentTransaction(String isbn) {
        // Hint: Use a backward loop to find the most recent transaction
        // If no transaction is found, print "No transactions found for ISBN: <isbn>"\
        for (int i = books.size(); i > 0; i--) {

        }
    }

    // TODO: Complete the implementation of LibrarySystem methods
    // TODO: Implement searchBookByTitle and searchBookByAuthor using binary search

    @Override
    public Book findClosestBook(String title) {
        // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
        for (int i = 0; i < books.size(); i++)
            if (books.get(i).getTitle().contains(title))
                return books.get(i).toString();
        return -1;
    }

    @Override
    public Book searchBookByTitle(String title) {
        // TODO: Binary search for book; if not found, return the closest book
        for (int i = 0; i < books.size(); i++)
            if (books.get(i).equals(title))
                return books.get(i);
        return -1;
    }

    @Override
    public Book searchBookByAuthor(String author) {
        for (int i = 0; i < books.size(); i++)
            if (books.get(i).getAuthor().equals(author))
                return books.get(i);
        return -1;
    }

    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.
    public String getBookByIsbn(String isbn) {
        for (int i = 0; i < books.size(); i++)
            if (books.get(i).getIsbn().equals(isbn))
                return books.get(i).toString();
        return -1;
    }

    public String getPatronById(String pId) {
        for (int i = 0; i < patrons.size(); i++)
            if (patrons.get(i).getPatronId().equals(pId))
                return patrons.get(i).getName();
        return -1;
    }

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
