package Q4.LibraryManagmentSystemLab;

public class Media {
    private String title;
    private String isbn;
    private boolean isCheckedOut;

    // TODO: Implement constructor (title, isbn)
    public Media(title, isbn) {
        title = title;
        isbn = isbn;
        isCheckedOut = false;
    }

    // TODO: Implement getter methods
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}
