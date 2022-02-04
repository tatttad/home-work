package classwork.Exceptions;

public class Exception7Example {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Catch exception");
        }
    }

    public static void method1() {
        try {
            System.out.println("Try");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Catch arithmetic exception");
            throw e;
        } finally {
            System.out.println("Finally");
        }
    }
}
