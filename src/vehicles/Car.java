package vehicles;

public class Car implements Drivable, Turnable, WithEngine {

    public void startEngine() {
        System.out.println("Car: Engine started");
    }

    public void stopEngine() {
        System.out.println("Car: Engine stopped");
    }

    public void accelerate() {
        System.out.println("Car: Acceleration started");
    }

    public void stop() {
        System.out.println("Car: Stop started");
    }

    public void turnLeft() {
        System.out.println("Car: Turn Left");
    }

    public void turnRight() {
        System.out.println("Car: Turn Right");
    }
}
