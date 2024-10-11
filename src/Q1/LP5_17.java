package Q1;

public class LP5_17 {
    public static String passwordGen(int len) {
        String pass = "";
        for (int i = 1; i < len; i++)
            pass += (char)(int)(Math.random() * 127 - 33) + 33;
        return pass;
    }

    public static void main(String[] args) {

    }
}

