import java.util.Arrays;

public class AsterisksDisplay {
    public static void main(String[] args) {
        String[][] a = new String[9][35];
        int i, j;

        for (j = 0; j <= 8; j++) {
            a[0][j] = "*";
            a[8][j] = "*";
        }
        for (i = 1; i <= 7; i++) {
            a[i][0] = "*";
            a[i][8] = "*";
        }
        for (i = 2; i <= 6; i++) {
            a[i][10] = "*";
            a[i][18] = "*";

        }
        for (i = 1; i <= 7; i += 6) {
            a[i][11] = "*";
            a[i][17] = "*";

        }
        for (j = 13; j <= 15; j++) {
            a[0][j] = "*";
            a[8][j] = "*";
        }
        for (i = 0; i <= 8; i++) {
            a[i][22] = "*";
        }
        for (j = 21; j <= 23; j += 2) {
            a[1][j] = "*";
        }
        for (j = 20; j <= 24; j++) {
            a[2][j] = "*";
        }
        for (i = 4, j = 26; i <= 8 && j <= 30; i++, j++) {
            a[i][j] = "*";
        }
        for (i = 0, j = 30; i <= 4 && j <= 34; i++, j++) {
            a[i][j] = "*";
        }
        for (i = 3, j = 27; i >= 1 && j <= 29; i--, j++) {
            a[i][j] = "*";
        }
        for (i = 7, j = 31; i >= 5 && j <= 33; i--, j++) {
            a[i][j] = "*";
        }


        for (i = 0; i <= 8; i++) //loops through rows
        {
            for (j = 0; j <= 34; j++) //loops through columns
            {
                if (a[i][j] == null)
                    a[i][j] = " ";

                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }
    }
}
