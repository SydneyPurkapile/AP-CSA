package Q3.Prog702p;

public class Animal implements names{
    private String fname;
    private String lname;
    private String word;

    public void Animal(String fn, String ln, String w) {
        fname = fn;
        lname = ln;
        word = w;
    }


    public String getName() {
        return fname + lname;
    }

    public String getWord() {
        return word;
    }
}
