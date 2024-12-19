package Q2.Prog214c;

public class Class214c {
    private String myGT;
    private int myGallons;
    private String myCW;
    private double Gcost;
    private double Ccost;
    private double cost;

    public Class214c(String GT, int gallons, String CW) {
        myGT = GT;
        myGallons = gallons;
        myCW = CW;
        Gcost = 0.0;
        Ccost = 0;
        cost = 0;
}

    public void getCost() {
        if (myGT.equals("P"))
            Gcost = 1.479;
        else if (myGT.equals("R"))
            Gcost = 1.359;
        else
            Gcost = 1.429;
        cost = Gcost * myGallons;
    }

    public void getCarwash() {
        if (myCW.equals("N"))
            Ccost = 0;
        else
            Ccost = (myGallons -10) * 0.1;
    }
}
