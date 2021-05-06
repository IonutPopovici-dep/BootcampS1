import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type the number: ");
        int n = scan.nextInt();

        System.out.print("The prime numbers are: ");
        boolean flag = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0) {
                    if (i == j)
                        flag = true;
                    else {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag)
                System.out.print(i + " ");

        }
    }
}
