package homework.week5;

import java.util.Scanner;

/* 1.For a given integer number N,print all integers that are multiple of 2 in descending order.
 */

public class MultipleOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
