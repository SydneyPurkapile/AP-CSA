package Q3.Prog702p;

public class Hiccas implements names {
    private String name;
    private String favWord;
    private double furWorth;

    public void Hiccas(String n, String fav, double fw) {
        name = n;
        favWord = fav;
        furWorth = fw;
    }

    public double getFurWorth() { return furWorth; }

    public String getName() { return name; }
    public String getWord() { return favWord; }
}
