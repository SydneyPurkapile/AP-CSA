package Q3.Farm.Prog505t;

import java.util.ArrayList;

public class Cow extends Animal{
    private static final double MILK_PRICE_LB = 0.20;
    private final double myMilk;

    public Cow(String name, int weight, double milk, int corn, int hay) {
        super(name, weight, corn, hay);
        myMilk = milk;
    }

    public double value(double cornCost, double hayCost) {
        return myMilk * MILK_PRICE_LB - getFeedCost(cornCost, hayCost);
    }

    public double getMilk() { return myMilk; }
    public double getMilkPrice() { return MILK_PRICE_LB; }

    @Override
    public boolean feedAllAnimals() {
        return false;
    }

    @Override
    public double farmIncome() {
        return 0;
    }

    public double getCost() {
        return MILK_PRICE_LB;
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
