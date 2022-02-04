package classwork.Exceptions;

public class Exception2Example {
    public static void main(String[] args) {
        try {
            System.out.print("In the try block ");
        } finally {
            System.out.print("In the finally block ");
        }
        System.out.print("Done ");
    }
}
