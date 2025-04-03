package Q3.Farm.Prog505t;
import java.util.ArrayList;

public class Horse extends Animal{
    private final int myNumRides;
    private final double myRideCost;

    public Horse(String name, int weight, int corn, int hay, int rides, double cost) {
        super(name, weight, corn, hay);
        myNumRides = rides;
        myRideCost = cost;
    }

    public double value(double cornCost, double hayCost) {
        return myNumRides * myRideCost - getFeedCost(cornCost, hayCost);
    }

    public String getName() { return super.getName() + super.getName() ;}
    public int getRides() { return myNumRides; }
    public double getRideCost() { return myRideCost; }

    @Override
    public boolean feedAllAnimals() {
        return false;
    }

    @Override
    public double farmIncome() {
        return 0;
    }

    public double getCost() {
        return myRideCost;
    }

    @Override
    public ArrayList<Cow> getCows() {
        return null;
    }

    @Override
    public ArrayList<Horse> getHorses() {
        return null;
    }
}
