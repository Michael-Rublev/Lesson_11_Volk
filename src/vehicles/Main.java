package vehicles;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Train train = new Train();
        Bicycle bicycle = new Bicycle();


//        Turnable[] vehicleThatTurn = {car, bicycle};
//        WithEngine[] vehicleWithEngine = {car, train};
//        for (WithEngine vehicle : vehicleWithEngine) {
//            vehicle.startEngine();
//        }

        Object[] vehicles = {car, train, bicycle};

        for (Object vehicle : vehicles) {
            if (vehicle instanceof WithEngine) {
                WithEngine v = (WithEngine)vehicle;
                v.startEngine();
            }
        }
    }
}
