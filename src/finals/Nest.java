package finals;

public class Nest extends AbstractThermostat {

    int targetTemp;

    public int getTargetTemp() {
        return targetTemp;
    }

    public void setTargetTemp(int targetTemp) {
        this.targetTemp = targetTemp;
    }

    @Override
    protected void sleep() {
        System.out.println("Nest is sleeping and sends all your information in Google inc.");
    }

    @Override
    protected void increaseTemp() {
        System.out.println("Turn on heat");
    }

    @Override
    protected boolean tooCold(int currentTemp) {
        return currentTemp < targetTemp;
    }

    @Override
    protected void decreaseTemp() {
        System.out.println("Turn on Air condition");
    }

    @Override
    protected boolean tooHot(int currentTemp) {
        return currentTemp > targetTemp;
    }
}
