package homework.week5;

/* 4.Write a value-returning method, isVowel that returns the value true
     if a given character is a vowel, and otherwise returns false.
 */

import java.util.Scanner;

public class IsVowel {
    public static boolean isVowel(char ch) {
        if (ch == 'A' || ch == 'a' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
                || ch == 'E' || ch == 'e' || ch == 'U' || ch == 'u'|| ch =='Y'|| ch =='y') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        System.out.println(isVowel(ch));
    }
}
