package classwork.Exceptions;

import java.io.IOException;

public class Exception3Example {
    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (Exception e) {
            System.out.println("In the exception catch block ");
//       catch (IOException e){
//            System.out.println("In the IOException catch block ");
//        }
        }
    }
}
