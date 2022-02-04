package homework.week4;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/* 9.Write a distance() function which
     1)return distance from (0.0 , 0.0) to (a) :distance(int, int)
     2)return the distance from a to be, if method distance get 4 int parameters :
       distance(int x1 , int x2, int x3, int x4) where (x1, x2) are the coordinates of a
 */
public class Task9 {
    public static double distance(int x1, int y1) {
        double x0 = 0.0;
        double y0 = 0.0;
        double d = sqrt(((x1 - x0) * (x1 - x0)) + ((y1 - y0) * (y1 - y0)));
        return d;
        //distance of two points d=sqrt((x1−x0)^2+(y1−y0)^2)
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x1 - x2;
        double b = y1 - y2;
        double d = sqrt((a * a) + (b * b));
        return d;
        //distance of two points d=sqrt((x1−x0)^2+(y1−y0)^2)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input coordinates of point :)");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("The distance of point from (0.0, 0.0) is " + distance(x, y));

        System.out.println("Please input coordinates of two points :)");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("The distance of first point from second is " + distance(x1, y1, x2, y2));

    }
}

