public class ExchangeValues {

    public static void main(String[] args) {
        int x = 5, y = 10, z;
        System.out.println("Before: x = " + x + " and y = " + y);
        z = x;
        x = y;
        y = z;
        System.out.println("After: x = " + x + " and y = " + y);
    }
}
