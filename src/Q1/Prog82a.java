package Q1;
import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Speed Limit: ");
        int sl = input.nextInt();
        System.out.print("Enter Vehicle Speed: ");
        int vs = input.nextInt();
        int dif = vs - sl;
        int tfc = dif * 5;
        int ticket = 20 + tfc;
        System.out.println("Fine: $" + ticket);
    }
}
/*
Enter Speed Limit: 30
Enter Vehicle Speed: 42
Fine: $80
 */