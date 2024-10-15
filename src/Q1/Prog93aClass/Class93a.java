package Q1.Prog93aClass;

public class Class93a {
    private int kwh;
    private double baseRate;
    private double surcharge;
    private double cityTax;
    private double total;
    private double lateTotal;

    public Class93a(int kwh) {
        this.kwh = kwh;
        baseRate = 0;
        surcharge = 0;
        cityTax = 0;
        total = 0;
        lateTotal = 0;
    }

    public void calc() {
        baseRate = kwh * 0.0475;
        surcharge = baseRate * 0.1;
        cityTax = baseRate * 0.3;
        total = baseRate + surcharge + cityTax;
        lateTotal = total * 1.04;
    }// TODO

    public String toString() {
        return "KWH Used: " + kwh +
                "\nBase Rate: " + baseRate +
                "\nSurcharge: " + surcharge +
                "\nCity Tax: " + cityTax +
                "\nTotal: " + total +
                "\nLate Total: " + lateTotal;
    }
}
