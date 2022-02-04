package homework.week4;

/* 19.Given a non-negative int n, return the sum of its digits recursively (no loops).
 */

import java.util.Scanner;

public class Task19 {
    public static int sum(int number) {
        int sumOfDigits;

        if (number < 0) {
            number = number * (-1);
        }
        if (number == 0) {
            return 0;
        } else {
            sumOfDigits = number % 10;
            return sumOfDigits + sum(number / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(sum(number));
    }
}
