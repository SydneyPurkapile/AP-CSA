package Q3.Prog702p;

public class Hiccas implements names {
    private String fname;
    private String lname;
    private String favWord;
    private double furWorth;

    public void Hiccas(String fn, String ln, String fav, double fw) {
        fname = fn;
        lname = ln;
        favWord = fav;
        furWorth = fw;
    }

    public double getFurWorth() { return furWorth; }

    public String getName() { return fname + lname; }
    public String getWord() { return favWord; }
}
