package homework.week6_vehicle;

public class Main {
    public static void main(String[] args) {
        Flyable airPlane = new AirPlane(580, 100);
        Vehicle airPlane1 = new AirPlane(600, 120);
        airPlane1.start();
        airPlane1.stop();
        System.out.println("The flight will take " + airPlane.flight("Russia", "Armenia", 4633) + " hours.");
        Vehicle car = new Car(120, 4);
        car.start();
        car.stop();

    }
}
