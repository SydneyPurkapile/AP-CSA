package Q4.LibraryManagmentSystemLab;

public class Book extends Media {
    private String author;

    // TODO: Implement constructor (title, isbn, author); call super constructor
    public Book(String title, String isbn, String auth) {
        super(title, isbn);
        author = auth;
    }

    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
