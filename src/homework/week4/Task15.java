package homework.week4;

import java.util.Scanner;

/* 15.Write a function that returns the first non-repeated character from a given string.
 */

public class Task15 {
    public static void firstNonRepeated(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("The first non repeated character in String is: " + str.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        firstNonRepeated(str);
    }
}
