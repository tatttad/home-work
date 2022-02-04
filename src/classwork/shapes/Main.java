package classwork.shapes;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 6);
        System.out.println("Count of classwork.shapes is " + Shape.count);
        System.out.println("Perimeter of rectangle is " + rectangle.perimeter());
        System.out.println("Area of rectangle is " + rectangle.area());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Count of classwork.shapes is " + Shape.count);
        System.out.println("Perimeter of Triangle is " + triangle.perimeter());
        System.out.println("Area of Triangle is " + triangle.area());

        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println("Radius of inscribed circle is " + triangle1.radiusOfInscribedCycle());

        // kam

        Inscribed inscribed = new Triangle(3,4,5);
        System.out.println("Radius of inscribed circle is " + inscribed.radiusOfInscribedCycle());
        System.out.println("Count of classwork.shapes is " + Shape.count);

        //county tpum a 4 qani vor menq Triangle obyekt enq sarqel

    }
}
