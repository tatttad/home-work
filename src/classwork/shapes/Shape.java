package classwork.shapes;

public abstract class Shape {

    public static int count;//amen angam jarangi obyekt sarqeluc constructori mej county mekov avelacnum enq, vor haskananq te es classic qani obyekt unenq

    Shape(){
        count++;
    }
    abstract double area();
    abstract double perimeter();

}
