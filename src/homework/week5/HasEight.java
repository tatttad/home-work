package homework.week5;

/* 2.Write a boolean method called hasEight(), which takes an int as input and returns
     true if the number contains the digit 8 (e.g., 18, 168, 1288).
     The signature of the method is as follows:
     public static boolean hasEight(int number)
 */

import java.util.Scanner;

public class HasEight {
    public static boolean hasEight(int number) {
        if (number < 0) {
            number *= (-1);
        }
        for (int i = 0; i <= number; i++) {
            int remainder = number % 10;
            if (remainder == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(hasEight(number));
    }
}
