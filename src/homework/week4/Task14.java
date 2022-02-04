package homework.week4;

import java.util.Scanner;

/* 14.The binary number system uses 2 symbols, 0 and 1.
      Write a function called checkBinStr to verify a binary string.
      The program shall prompt the user for a binary string; and decide if the input string is a valid binary string.
      For example, Enter a binary string: 10101100
      "10101100" is a binary string
      Enter a binary string: 10120000
      "10120000" is NOT a binary string
 */
public class Task14 {
    public static boolean checkBinStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0' || str.charAt(i) == '1') {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary string: ");
        String str = scanner.nextLine();
        if (checkBinStr(str) == true) {
            System.out.println(str + " is a binary string.");
        } else {
            System.out.println(str + " is NOT a binary string.");
        }
    }
}
