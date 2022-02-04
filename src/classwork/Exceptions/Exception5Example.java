package classwork.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception5Example {
    public static void main(String[] args) {
        try {
            readFromFile();
        } catch (IOException e) {//(IOException | FileNotFoundException e)
            e.printStackTrace();
        }
        System.out.println("Done");
    }

    public static void readFromFile() throws IOException {
        System.out.println("Reading line ");
    }
}
