public class OneStaticFieldOnly {

    static int a = 1;

    void increment() {
        a++;
    }

    public static void main(String[] args) {
        System.out.println("a = " + a);
        OneStaticFieldOnly obj1 = new OneStaticFieldOnly();
        obj1.increment();
        System.out.println("a = " + a);
        OneStaticFieldOnly obj2 = new OneStaticFieldOnly();
        obj2.increment();
        System.out.println("a = " + a);
        OneStaticFieldOnly obj3 = new OneStaticFieldOnly();
        obj3.increment();
        System.out.println("a = " + a);
    }
}
