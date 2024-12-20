package Q2.Prog214c;

public class Class214c {
    private double gallons;
    private String wash;
    private String type;
    private double TGC;
    private double GC;
    private double WC;
    private double total;

    public Class214c(double g, String w, String t) {
        gallons = g;
        wash = w;
        type = t;
        TGC = 0.0;
        GC = 0.0;
        WC = 2.0;
        total = 0.0;
    }

    public void calcGC() {
        if (type.equals("R")) {
            GC = 1.359;
            TGC = GC * gallons;
        } else if (type.equals("P")) {
            GC = 1.479;
            TGC = GC * gallons;
        } else {
            GC = 1.429;
            TGC = GC * gallons;
        }
    }

    public void calcWC() {
        if (wash.equals("Y")) {
            if (gallons > 20)
                WC = 0;
            else if (gallons > 10)
                WC -= ((gallons - 10) * 0.2);
            else
                WC = 2.0;
        } else
            WC = 0;
    }

    public void totalCalc() {
        total = TGC + WC;
    }

    public double getGC()    { return GC; }
    public double getTGC()   { return TGC; }
    public double getWC()    { return WC; }
    public double getTotal() { return total; }
}
