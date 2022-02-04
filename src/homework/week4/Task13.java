package homework.week4;

import java.util.Scanner;

/* 13.Write a function to check if the passed String palindrome or not
      Print “xxx” is|is not a Palindrome.
      A word that reads the same backward as forward is called a palindrome,
      e.g., "mom", "dad", "racecar", "madam", and "Radar" (case-insensitive).
 */
public class Task13 {
    public static void palindromeString(String str) {
        String strRev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strRev += str.charAt(i);
        }
        if(strRev.equals(str)){
            System.out.println("Is palindrome.");
        } else {
            System.out.println("Is not palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scanner.nextLine();
        palindromeString(str);
    }

}
