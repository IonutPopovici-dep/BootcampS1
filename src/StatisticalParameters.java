import java.util.Scanner;

public class StatisticalParameters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type value of x1: ");
        double x1 = scan.nextDouble();
        System.out.print("Type value of x2: ");
        double x2 = scan.nextDouble();
        System.out.print("Type value of x3: ");
        double x3 = scan.nextDouble();

        double u = (x1 + x2 + x3) / 3;
        double o2 = ((x1 - u) * (x1 - u) + (x2 - u) * (x2 - u) + (x3 - u) * (x3 - u)) / 3;
        double o = Math.sqrt(o2);

        System.out.println("Mean: u = " + u);
        System.out.println("Variance: o2 = " + o2);
        System.out.println("Standard deviation: o = " + o);
    }
}
