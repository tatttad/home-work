package classwork;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();
        parent.printHello();
        child.printHello();
        new Parent();

        //kam
        System.out.println(Parent.count);

    }
}
