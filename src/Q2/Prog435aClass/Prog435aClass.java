package Q2.Prog435aClass;
import Q2.Prog402a.Class402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435aClass {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435a.dat"));
            System.out.println("Car Type\tBase Toll\tFactor\tCost");
            while (file.hasNext()) {
                int car = file.nextInt();
                int gate = file.nextInt();
                Class435a stuff = new Class435a(car, gate);
                stuff.getToll();
                stuff.getFactor();
                stuff.getCost();
                stuff.toString();
                System.out.println(stuff);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Car Type	Base Toll	Factor	Cost
1		1.35		1.0		$1.35
2		2.5		1.3		$3.25
3		4.1		1.6		$6.56
4		5.5		2.0		$11.0
5		2.0		2.4		$4.8
6		3.25		2.7		$8.775
1		4.8		1.0		$4.8
2		6.0		1.3		$7.800000000000001
3		1.35		1.6		$2.16
4		2.5		2.0		$5.0
5		4.1		2.4		$9.839999999999998
6		5.5		2.7		$14.850000000000001
1		6.0		1.0		$6.0
2		1.35		1.3		$1.7550000000000001
3		2.0		1.6		$3.2
4		2.5		2.0		$5.0
5		3.25		2.4		$7.8
6		4.1		2.7		$11.07
 */