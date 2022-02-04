package homework.week4;

import java.util.Scanner;

/* 3. A nonnegative integer is called a palindrome if it reads forward and backward in the same way.
      For example, the numbers 5, 121, 3443, and 123454321 are palindromes. '
      Write a method that takes as input a nonnegative integer and returns true if the number is a palindrome;
      otherwise, it returns false. Also write a program to test your method
      (i.e. write another function which will call your isPalindrome function and check if it works right).
 */
public class Task3 {
    public static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while(n > 0) {
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n / 10;
        }
        if (temp == rev) {
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPalindrome(n));
    }
}
