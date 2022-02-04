package homework.week4;

import java.util.Scanner;

/* 4.Write a method called search(), which takes an array of int and an int;
     and returns the array index if the array contains the given int; or -1 otherwise.
     The method's signature is as follows: public static int search(int[] array, int key);
 */

public class Task4 {
    public static int search(int[] array, int key){
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                index = i;
                break;//1st met
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i< array.length;i++){
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(search(array,key));

    }
}
