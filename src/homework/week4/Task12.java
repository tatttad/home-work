package homework.week4;

import java.util.Scanner;

/* 12.Write a function called reverseString, which prompts the user for a String,
      and prints the reverse of the String by extracting and processing each character.
      The output shall look like:
                                 Enter a String: abcdef
                                 The reverse of the String "abcdef" is "fedcba"
 */
public class Task12 {
    public static String reverseString(String str) {
        String strRev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            strRev += str.charAt(i);
        }
        return strRev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scanner.nextLine();
        System.out.println("The reverse of the String "  + str + " is " + reverseString(str));
    }
}
