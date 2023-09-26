package vehicles;

public class Train implements WithEngine, Drivable {
    @Override
    public void accelerate() {
        System.out.println("Train: Acceleration WHHOOOW!");
    }
    @Override
    public void stop() {
        System.out.println("Train: stoped!");
    }
    @Override
    public void startEngine() {
        System.out.println("Train: Engine started");
    }
    @Override
    public void stopEngine() {
        System.out.println("Train: Engine stopping!");
    }
}
