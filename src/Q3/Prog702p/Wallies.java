package Q3.Prog702p;

public class Wallies implements names {
    private String name;
    private String favWord;
    private int steps;

    public void Wallies(String n, String fav, int s) {
        name = n;
        favWord = fav;
        steps = s;
    }

    public int getSteps() { return steps; }

    public String getName() { return name; }
    public String getWord() { return favWord; }
}
