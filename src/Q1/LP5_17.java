package Q1;
import java.util.Scanner;

public class LP5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "Pa$$w0rd";
        int wow = 0;
        while (wow < 3) {
            wow += 1;
            System.out.print("Enter Password: ");
            String ep = input.nextLine();
            if (password.equals(ep)) {
                System.out.println("Welcome!");
                break;
            } else System.out.println("Password is Incorrect");
        }
        if (wow == 3) System.out.println("Access Denied");
    }
}

