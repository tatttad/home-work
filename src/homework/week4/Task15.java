package homework.week4;

import java.util.Scanner;

/* 15.Write a function that returns the first non-repeated character from a given string.
 */

public class Task15 {
    public static char firstNonRepeated(String str) {
        char ch = '0';
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    continue;
                } else {
                    ch = str.charAt(i);
                }

            }
        }

        return ch;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(firstNonRepeated(str));
    }
}
