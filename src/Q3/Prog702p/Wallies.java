package Q3.Prog702p;

public class Wallies implements names {
    private String fname;
    private String lname;
    private String favWord;
    private int steps;

    public void Wallies(String fn, String ln, String fav, int s) {
        fname = fn;
        lname = ln;
        favWord = fav;
        steps = s;
    }

    public int getSteps() { return steps; }

    public String getName() { return fname + lname; }
    public String getWord() { return favWord; }
}
