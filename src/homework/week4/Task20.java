package homework.week4;

/* 20.Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
 */

import java.util.Scanner;

public class Task20 {
    public static int occurrencesOfSeven(int number) {
        int count = 0;
        if (number < 0) {
            number = number * (-1);
        }
        if (number == 0) {
            return 0;
        } else {
            while(number > 0){
                int digit = number % 10;
                if(digit == 7){
                    count++;
                }
                number/=10;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(occurrencesOfSeven(number));
    }
}
