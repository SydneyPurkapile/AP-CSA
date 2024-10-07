package Q1.Prog52aClass;

public class Class52a {  // Rectangle (Helper Class)
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    // Input Section (Constructor)
    public Class52a(int len, int wid) {
        // Set up private data
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;
    }
    // Calculation Section (Mutators/Setters)
    public void calc() {
        myArea = myLen * myWid;
        myPerim = myLen * 2 + myWid * 2;
    }
    // Output Section (Accessors/Getters)
    public int getArea()  {  return myArea;  }
    public int getPerim() {  return myPerim; }

    // Class Methods: "public <return_type> <name>(<args>) { ... }
}
