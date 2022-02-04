package classwork;

public class Parent {
    public static int count;
    public final int HASHV;
    public static final int COUNT = 2;//kam haytararman pahin enq init anum
    public static final int COUNT1;

    static {
        COUNT1 = 4;//kam static blockum enq init anum
        System.out.println("Static block");
        count = 2;
    }

    Parent() {
        HASHV = 2;
    }

    public static void printHello() {
        System.out.println("hello from parent");
    }
    {
        System.out.println("Initializing block from Parent");
    }
}
