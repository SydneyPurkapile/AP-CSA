package Q1.Prog213bClass;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213bClass {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog213b.txt"));

            while (file.hasNext()) {
                int qnt = file.nextInt();
                Class213b wowza = new Class213b(qnt);
                wowza.calc();
                System.out.println(wowza);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Quantity: 15	Price: $5.95	AmountDue: $89.25
Quantity: 45	Price: $5.95	AmountDue: $267.75
Quantity: 55	Price: $5.95	AmountDue: $327.25
Quantity: 56	Price: $5.95	AmountDue: $333.20
Quantity: 42	Price: $5.95	AmountDue: $249.90
Quantity: 115	Price: $5.75	AmountDue: $661.25
Quantity: 92	Price: $5.95	AmountDue: $547.40
Quantity: 31	Price: $5.95	AmountDue: $184.45
Quantity: 75	Price: $5.95	AmountDue: $446.25
Quantity: 48	Price: $5.95	AmountDue: $285.60
Quantity: 58	Price: $5.95	AmountDue: $345.10
Quantity: 1	Price: $5.95	AmountDue: $5.95
Quantity: 25	Price: $5.95	AmountDue: $148.75
Quantity: 16	Price: $5.95	AmountDue: $95.20
Quantity: 19	Price: $5.95	AmountDue: $113.05
 */