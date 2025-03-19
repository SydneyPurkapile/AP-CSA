package Q3.Prog702p;

public class Beepers extends Animal {
    private String extraWord;

    public void Beepers(String fn, String ln, String fav, String ew) {
        super(fn, ln, fav);
        extraWord = ew;
    }

    public String getExtraWord() { return extraWord; }

    public String getName() { return fname + lname; }
    public String getWord() { return favWord; }
}
