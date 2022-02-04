package homework.week4;

import java.util.Scanner;

/* 2.Write a function static boolean isPrime(int n), where n != 1 and n < 20000000, which return true if n is prime else false.
 */
public class Task2 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }
}
