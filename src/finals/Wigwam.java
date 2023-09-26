package finals;

public class Wigwam extends AbstractThermostat{

    @Override
    protected void sleep() {
        System.out.println("Sidim tiho, pesni poem");
    }

    @Override
    protected void increaseTemp() {
        System.out.println("Podkinut drov d ogon");
    }

    @Override
    protected boolean tooCold(int currentTemp) {
        return currentTemp < 18;
    }

    @Override
    protected void decreaseTemp() {
        System.out.println("Otkryt polog");
    }

    @Override
    protected boolean tooHot(int currentTemp) {
        return currentTemp > 25;
    }
}
