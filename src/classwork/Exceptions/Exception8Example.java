package classwork.Exceptions;

public class Exception8Example {
    public static String someMethod() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            return "Catch";
        } finally {
            return "Finally";
        }
    }

    public static void main(String[] args) {
        System.out.println(someMethod());
    }
}
