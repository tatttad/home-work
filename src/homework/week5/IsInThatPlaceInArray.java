package homework.week5;

/* 7.Write a method that get as an argument int[ ] array, int argument, int index
     returns true if that element is in that place in array,otherwise false
     public static boolean search(int[] array, int argument, int index)
 */

import java.util.Scanner;

public class IsInThatPlaceInArray {
    public static boolean search(int[] array, int argument, int index) {
        for (int i = 0; i < array.length; i++) {
            if (argument == array[index]) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int argument = scanner.nextInt();
        int index = scanner.nextInt();
        System.out.println(search(array, argument, index));
    }
}
