package Q1;

public class Prog122d {
    public static void main(String[] args) {
        int lcv1 = -13;
        double lcv2 = 0;
        while (lcv1 < 16) {
            lcv1 += 1;
            lcv2 = (int)Math.pow(lcv1, 6) - (3 * (int)Math.pow(lcv1, 5)) - (93 * (int)Math.pow(lcv1, 4)) + (87 * (int)Math.pow(lcv1, 3)) + (1596 * (int)Math.pow(lcv1, 2)) - (1380 * lcv1) - 2800;
            System.out.println(lcv1 + "\t\t" + lcv2);
        }
    }
}
/*
-12		1897280.0
-11		982800.0
-10		453600.0
-9		173888.0
-8		45360.0
-7		0.0
-6		-6400.0
-5		0.0
-4		6048.0
-3		7280.0
-2		4320.0
-1		0.0
0		-2800.0
1		-2592.0
2		0.0
3		2240.0
4		0.0
5		-10800.0
6		-32032.0
7		-60480.0
8		-84240.0
9		-78400.0
10		0.0
11		217728.0
12		671840.0
13		1496880.0
14		2872800.0
15		5033600.0
16		8276688.0
 */