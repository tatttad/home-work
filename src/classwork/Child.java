package classwork;

public class Child extends Parent{
    public static void printHello(){
        System.out.println("hello from child");
    }

    {
        System.out.println("Initializing block from child");
    }
}
