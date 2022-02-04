package homework.week4;

import java.util.Scanner;

/* 16.Write a function that counts occurrences of a certain character in a given string.
      Pass as an argument (String str, char ch)
 */

public class Task16 {
    public static int occurrencesOfChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = scanner.next().charAt(0);
        System.out.println(occurrencesOfChar(str,ch));
    }
}
