package Q3.Prog702p;

public class Beepers implements names {
    private String name;
    private String favWord;
    private String extraWord;

    public void Beepers(String n, String fav, String ew) {
        name = n;
        favWord = fav;
        extraWord = ew;
    }

    public String getExtraWord() { return extraWord; }

    public String getName() { return name; }
    public String getWord() { return favWord; }
}
