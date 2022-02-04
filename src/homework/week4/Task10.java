package homework.week4;

import java.util.Scanner;

/* 10.Write a function` reminder() which
      1)when pass one int value, return sum of digits for that value reminder(int)
      2)when pass one int value and one natural int, return reminder from sum of digits
      divided to second parameter(reminder(int 331, int 5) {return (3 + 3 + 1) % 5
 */
public class Task10 {
    public static int reminder(int num) {
        int sum = 0;
        if (num > 0) {
            while (num > 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
        } else {
            num = num * (-1);
            while (num > 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
        }
        return sum;
    }

    public static int reminder(int num, int n) {
        int sum = 0;
        if (num > 0) {
            while (num > 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
        } else {
            num = num * (-1);
            while (num > 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
        }
        return sum % n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(reminder(num));

        int num1 = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(reminder(num1, n));
    }
}
