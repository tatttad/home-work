package homework.week5;

/* 3.Write a function  which returns the value (true or false) which is
     more common among the values of its arguments x, y, z.
     static boolean election(boolean x, boolean y, boolean z).
     Example` Input: true true false
              Output: true
 */

import java.util.Scanner;

public class Election {
    public static boolean election(boolean x, boolean y, boolean z) {
        if (((x == true) && (y == true)) && (z == false)) {
            return true;
        } else if (((x == true) && (z == true)) && (y == false)) {
            return true;
        } else if (((y == true) && (z == true)) && (x == false)) {
            return true;
        } else if((x == true) && (y == true) && (z == true)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = scanner.nextBoolean();
        boolean y = scanner.nextBoolean();
        boolean z = scanner.nextBoolean();
        System.out.println(election(x, y, z));
    }
}
