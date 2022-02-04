package homework.week6_vehicle;

public class AirPlane extends Vehicle implements Flyable {
    AirPlane(int speed, int count) {
        super(speed, count);
    }

    @Override
    public int flight(String from, String to, int kilometers) {
        int hours;
        int speed = super.getSpeed();
        hours = kilometers / speed;
        return hours;
    }

    @Override
    public void start() {
        System.out.println("Airplane started");
    }

    @Override
    public void stop() {
        System.out.println("Airplane stopped");
    }
}
