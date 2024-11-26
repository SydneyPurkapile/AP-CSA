package Q2.Prog435aClass;

public class Class435a {
    private int myCar;
    private int myGate;
    private double myToll;
    private double myFactor;
    private double myCost;

    public Class435a(int car, int gate) {
        myCar = car;
        myGate = gate;
        myToll = 0.0;
        myFactor = 0.0;
        myCost = 0.0;
    }

    public double getToll() {
        if (myGate == 1) myToll = 1.35;
        if (myGate == 2) myToll = 2.00;
        if (myGate == 3) myToll = 2.50;
        if (myGate == 4) myToll = 3.25;
        if (myGate == 5) myToll = 4.10;
        if (myGate == 6) myToll = 4.80;
        if (myGate == 7) myToll = 5.50;
        if (myGate == 8) myToll = 6.00;
        return myToll;
    }

    public double getFactor() {
        if (myCar == 1) myFactor = 1.0;
        if (myCar == 2) myFactor = 1.3;
        if (myCar == 3) myFactor = 1.6;
        if (myCar == 4) myFactor = 2.0;
        if (myCar == 5) myFactor = 2.4;
        if (myCar == 6) myFactor = 2.7;
        return myFactor;
    }

    public double getCost() {
        myCost = myFactor * myToll;
        return myCost;
    }

    public String toString() {
        return myCar + "\t\t" + myToll + "\t\t" + myFactor + "\t\t$" + myCost;
    }
}
