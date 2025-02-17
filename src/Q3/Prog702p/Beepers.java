package Q3.Prog702p;

public class Beepers implements names {
    private String fname;
    private String lname;
    private String favWord;
    private String extraWord;

    public void Beepers(String fn, String ln, String fav, String ew) {
        fname = fn;
        lname = ln;
        favWord = fav;
        extraWord = ew;
    }

    public String getExtraWord() { return extraWord; }

    public String getName() { return fname + lname; }
    public String getWord() { return favWord; }
}
