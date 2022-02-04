package classwork.shapes;

import java.util.ArrayList;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public void setA(double a) {
        if (a >= 0) {
            this.a = a;
        } else {
            System.out.println("Not valid parameter");
        }
    }

    public void setB(double b) {
        if (b >= 0) {
            this.b = b;
        } else {
            System.out.println("Not valid parameter");
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    Rectangle(double a, double b) {
        setA(a);
        setB(b);

    }


    @Override
    double area() {
        double area = a * b;
        return area;
    }

    @Override
    double perimeter() {
        double perimeter = 2 * (a + b);
        return perimeter;
    }
}
