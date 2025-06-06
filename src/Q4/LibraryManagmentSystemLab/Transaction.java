package Q4.LibraryManagmentSystemLab;

public class Transaction {
    private String isbn;
    private String patronId;
    private String checkoutDate; // Simple date format
    private String returnDate; // Optional, can be null if not returned yet

    // TODO: Implement constructor (isbn, patronId, checkoutDate); set returnDate to null by default
    public Transaction(String ISBN, String pId, String CD) {
        isbn = ISBN;
        patronId = pId;
        checkoutDate = CD;
        returnDate = null;
    }

    // TODO: Implement getters and setters
    public String getIsbn()         { return isbn;         }
    public String getPatronId()     { return patronId;     }
    public String getCheckoutDate() { return checkoutDate; }
    public String getReturnDate()   { return returnDate;   }

    public void setIsbn(String ISBN)      { isbn = ISBN;       }
    public void setPatronId(String pId)   { patronId = pId;    }
    public void setCheckedDate(String CD) { checkoutDate = CD; }
    public void setReturnDate(String RD) { returnDate = RD; }

    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + isbn + '\'' +
                ", patronId='" + patronId + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
