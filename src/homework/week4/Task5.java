package homework.week4;

import java.util.Arrays;
import java.util.Scanner;

/* 5. Write a method called copyOf(), which takes an int Array and returns a copy of the given array.
      The method's signature is as follows: public static int[] copyOf(int[] array)
 */
public class Task5 {
    public static int [] copyOf(int [] arr){
        int [] copyArr = new int[arr.length];
        for (int i = 0; i < copyArr.length; i++){
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            int[] arr = copyOf(array);
            System.out.print(arr[i] + " ");
        }

    }
}
