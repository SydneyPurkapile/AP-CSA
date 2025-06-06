package Q3.Farm.Prog505t;

public abstract class Animal implements IFarm {
    private String myName;
    private int myWeight;
    private int myNumCorn;
    private int myNumHayBales;

    public Animal(String name, int weight, int corn, int hay) {
        myName = name;
        myWeight = weight;
        myNumCorn = corn;
        myNumHayBales = hay;
    }

    public abstract double value(double cornCost, double hayCost);

    public String getName() { return myName; }
    public int getWeight() { return myWeight; }
    public int getNumCorn() { return myNumCorn; }
    public int getNumHayBales() { return myNumHayBales; }

    public double getFeedCost(double cornCost, double hayCost) {
        return(myNumCorn * cornCost) + (myNumHayBales * hayCost);
    }
}
