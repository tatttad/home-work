package homework.week4;

import java.util.Scanner;

/* 8. Write a square() method, which
      if get one int parameter returns the square of circle
      if get one float parameter returns the square of square
      if get 2 parameters returns the square of rectangle
 */
public class Task8 {
    public static double square(int r) {
        double pi = 3.14;
        double area = pi * r * r;
        return area;
    }

    public static double square(float a) {
        double area = a * a;
        return area;
    }

    public static double square(int firstSide, int secondSide) {
        double area = firstSide * secondSide;
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input radius of circle :)");
        int r = scanner.nextInt();
        System.out.println("The area of circle is " + square(r));

        System.out.println("Please input side of square :)");
        float a = scanner.nextInt();
        System.out.println("The area of square is " + square(a));

        System.out.println("Please input two sides of rectangle :)");
        int fistSide = scanner.nextInt();
        int secondSide = scanner.nextInt();
        System.out.println("The area of rectangle is " + square(fistSide,secondSide));
    }
}
