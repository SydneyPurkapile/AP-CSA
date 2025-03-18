package Q3.Prog702q;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog702q.txt"));
            int totalV = 0;
            double totalValue = 0.0;
            double totalCarValue = 0.0;
            String LDN = "";
            double truckLV = 0.0;
            int CT = 0;
            int TT = 0;
            int BT = 0;

            while (file.hasNext()) {
                totalV++;
                int type = file.nextInt();
                String n = file.next();
                int t = file.nextInt();
                double v = 0.0;
                if (type == 1) {
                    v = file.nextDouble();
                    Cars honda = new Cars(n, t, v);
                    CT += t;
                    totalValue += v;
                    totalCarValue += v;
                } else if (type == 2) {
                    int m = file.nextInt();
                    v = 50000 - (m * 0.25);
                    Trucks ford = new Trucks(n, t, v, m);
                    TT += t;
                    totalValue += v;
                    if (truckLV < v)
                        truckLV = v;
                } else if (type == 3) {
                    String hc = file.next();
                    v = 50000;
                    Busses schoolBus = new Busses(n, t, v, hc);
                    BT += t;
                    totalValue += v;
                    if (LDN.length() < hc.length())
                        LDN = hc;
                } else
                    return;
            }
            System.out.println("Total number of vehicles: " + totalV);
            System.out.println("Total value of vehicles: " + totalValue);
            System.out.println("Total value of cars: " + totalCarValue);
            System.out.println("Truck with the least value: " + truckLV);
            System.out.println("Bus with the longest home destination name: " + LDN);
            System.out.println("Tire Totals:");
            System.out.println("  Car: " + CT);
            System.out.println("  Truck: " + TT);
            System.out.println("  Bus: " + BT);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
Total number of vehicles: 13
Total value of vehicles: 428199.75
Total value of cars: 33950.0
Truck with the least value: 43750.0
Bus with the longest home destination name: Minneapolis
Tire Totals:
  Car: 15
  Truck: 95
  Bus: 69
 */