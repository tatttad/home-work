package homework.week4;
import java.util.Objects;
import java.util.Scanner;

/* 11.Write a function which checks if the given String contains a given character.
      Pass as parameters String str, char ch.
 */
public class Task11 {
    public static String check(String str, char ch){
        String s = "";
        for(int i = 0; i<str.length();i++){
            if(Objects.equals(str.charAt(i), ch)){
                s = "Contains";
            } else {
               s = "Doesn't contain";
            }

        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = scanner.next().charAt(0);
        System.out.println(check(str, ch));
    }
}
