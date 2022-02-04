package homework.week4;

/* 18.We have triangles made of blocks. The topmost row has 1 block, the next
      row down has 2 blocks, the next row has 3 blocks, and so on. Compute
      recursively (no loops or multiplication) the total number of blocks in
      such a triangle with the given number of rows.
      Example` triangle(0) -> 0
               triangle(1) -> 1
               triangle(2) -> 3
 */

import java.util.Scanner;

public class Task18 {
    public static int triangle(int rows){
        if(rows==0){
            return 0;
        }
        return rows + triangle(rows-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println(triangle(rows));
    }
}
