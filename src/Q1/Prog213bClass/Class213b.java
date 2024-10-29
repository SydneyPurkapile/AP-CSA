package Q1.Prog213bClass;

public class Class213b {
    private int myQuantity;
    private double myPrice;
    private double myAD;

    public Class213b(int quantity) {
        myQuantity = quantity;
        myPrice = 0;
        myAD = 0;
    }

    public void calc() {
        if (myQuantity >= 0 && myQuantity <= 99)
            myPrice = 5.95;
        else if (myQuantity >= 100 && myQuantity <= 199)
            myPrice = 5.75;
        else if (myQuantity >= 200 && myQuantity <= 299)
            myPrice = 5.40;
        else
            myPrice = 5.15;

        myAD = myPrice * myQuantity;
    }

    public String toString() {
        return(String.format("Quantity: %d\tPrice: $%.2f\tAmountDue: $%.2f", myQuantity, myPrice, myAD));
    }
}
