package homework.week6_vehicle;

public abstract class Vehicle {
    private int speed;
    private int count;

    public int getSpeed() {
        return speed;
    }

    public int getCount() {
        return count;
    }


    Vehicle(int speed, int count) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed!");
        }
        if (count > 0) {
            this.count = count;
        } else {
            System.out.println("Invalid count!");
        }
    }

    public abstract void start();

    public abstract void stop();
}
