public class VampireNumber {
    public static void main(String[] args) {
        int number = 9999;
        for (int i = 1000; i <= number; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100 % 10;
            int d = i / 1000;

            int n1 = Integer.parseInt("" + a + b);
            int n2 = Integer.parseInt("" + a + c);
            int n3 = Integer.parseInt("" + a + d);
            int n4 = Integer.parseInt("" + b + a);
            int n5 = Integer.parseInt("" + b + c);
            int n6 = Integer.parseInt("" + b + d);
            int n7 = Integer.parseInt("" + c + a);
            int n8 = Integer.parseInt("" + c + b);
            int n9 = Integer.parseInt("" + c + d);
            int n10 = Integer.parseInt("" + d + a);
            int n11 = Integer.parseInt("" + d + b);
            int n12 = Integer.parseInt("" + d + c);

             /* int p1 = n1 * n9;
                int p2 = n1 * n12;
                int p3 = n2 * n6;
                int p4 = n2 * n11;
                int p5 = n3 * n5;
                int p6 = n3 * n8;
                int p7 = n4 * n9;
                int p8 = n4 * n12;
                int p9 = n5 * n10;
                int p10 = n6 * n7;
                int p11 = n7 * n11;
                int p12 = n8 * n10;

                int[] products = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12};
                for (int n : products) {
                    if (n == i)
                         System.out.println(i);
                }
                */

            int[][] p = {{n1, n9}, {n1, n12}, {n2, n6}, {n2, n11}, {n3, n5}, {n3, n8}, {n4, n9}, {n4, n12}, {n5, n10}, {n6, n7}, {n7, n11}, {n8, n10}};
            for (int x = 0, y = 0; x < 12; x++) {

                if (p[x][y] * p[x][y + 1] == i)
                    System.out.println(i + " from " + p[x][y] + " * " + p[x][y + 1]);

            }
        }
    }
}
