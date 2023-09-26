package finals;

import static java.lang.Thread.sleep;

public abstract class AbstractThermostat {
    final void checkAndAdjust (int currentTemp) {
        if (tooHot(currentTemp)) {
            decreaseTemp();
        } else if (tooCold(currentTemp)) {
            increaseTemp();
        } else {
            sleep();
        }
    }

    protected abstract void sleep();

    protected abstract void increaseTemp();

    protected abstract boolean tooCold(int currentTemp);

    protected abstract void decreaseTemp();

    protected abstract boolean tooHot(int currentTemp);
}
