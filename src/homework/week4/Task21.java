package homework.week4;

/*  21.Given a string, compute recursively a new string where all the 'x' chars have been removed.
       Use` str.substring().
 */

import java.util.Scanner;



public class Task21 {
    public static String removedX(String str) {
        String newStr = "";
        if (str.isEmpty()) {
            return str;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                    continue;
                } else {
                    newStr += str.charAt(i);
                }
            }
            return newStr;
        }
    }
    public static String removedXRecursion(String str){
        if(str.length()==0) {
            return "";
        }
        if (str.charAt(0) == 'x' || str.charAt(0)=='X') {
            return removedXRecursion(str.substring(1));
        }
        return str.charAt(0) +  removedXRecursion(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str=scanner.nextLine();

        System.out.println(removedX(str));
        System.out.println(removedXRecursion(str));
    }
}
