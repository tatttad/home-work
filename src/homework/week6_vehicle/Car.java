package homework.week6_vehicle;

public class Car extends Vehicle {

    Car(int speed, int count) {
        super(speed, count);
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
