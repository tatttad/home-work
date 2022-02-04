package homework.week4;

import java.util.Scanner;

/* 1.Write a function static double(double a, int n) calculating the value of a to the power of n.
 */
public class Task1 {
    public static double powerOfN(double a, int n) {
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow *= a;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println(powerOfN(a, n));
    }

}