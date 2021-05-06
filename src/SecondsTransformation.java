import java.util.Scanner;

public class SecondsTransformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Type here the number of seconds: ");
            int seconds = scan.nextInt();

            if ((seconds / 3600) >= 1) {
                int h = seconds / 3600;
                if (h == 1)
                    System.out.print(h + " hour, ");
                else
                    System.out.print(h + " hours, ");
                seconds = seconds - h * 3600;
                if ((seconds % 60 >= 0)) {
                    int m = seconds / 60;
                    if (m == 1)
                        System.out.print(m + " minute and ");
                    else
                        System.out.print(m + " minutes and ");
                    seconds = seconds - m * 60;
                }
                if (seconds == 1)
                    System.out.print(String.format("%s%n%n", seconds + " second"));
                else
                    System.out.print(String.format("%s%n%n", seconds + " seconds"));


            } else if ((seconds / 60 >= 1)) {
                int m = seconds / 60;
                if (m == 1)
                    System.out.print(m + " minute and ");
                else
                    System.out.print(m + " minutes and ");
                seconds = seconds - m * 60;

                if (seconds == 1)
                    System.out.print(String.format("%s%n%n", seconds + " second"));
                else
                    System.out.print(String.format("%s%n%n", seconds + " seconds"));


            } else if (seconds >= 0) {
                if (seconds == 1)
                    System.out.print(String.format("%s%n%n", seconds + " second"));
                else
                    System.out.print(String.format("%s%n%n", seconds + " seconds"));


            } else {
                scan.close();
                return;
            }

        }
    }
}
