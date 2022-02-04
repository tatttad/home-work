package homework.week4;

/* 22.Write recursive function that reverses the given String.
      Example` HELLO -> OLLEH
 */

import java.util.Scanner;

public class Task22 {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverse(str));
    }
}
