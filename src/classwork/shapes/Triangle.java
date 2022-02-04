package classwork.shapes;

public class Triangle extends Shape implements Inscribed {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    Triangle(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b > c) && (b + c > a) && (a + c > b)) {
                this.a = a;
                this.b = b;
                this.c = c;
            } else {
                System.out.println("Not a valid triangle");
            }
        } else {
            System.out.println("Parameters are not valid");
        }
    }

    @Override
    double area() {
        double p = perimeter() / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    @Override
    double perimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public double radiusOfInscribedCycle() {
        double s = area();
        double radius = (a * b * c) / (4 * s);
        return radius;
    }
}
