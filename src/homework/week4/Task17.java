package homework.week4;

/* 17.Write a recursive function to find the sum of a given array.
 */

import java.util.Scanner;

public class Task17 {
    public static int sumOfArray(int[] array, int n) {
        int sum = 0;
        if (n <= 0) {
            sum = 0;
        } else {
            sum = array[n - 1] + sumOfArray(array, n - 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {4, 4, 9};
        System.out.println(sumOfArray(array, array.length));
    }
}
