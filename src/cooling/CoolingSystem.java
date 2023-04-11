package cooling;

/**
 * Models a simple cooling system of with multiple synchronized fans.
 */
public class CoolingSystem {

    /**
     * Maximum number of fans a simple cooling system may contain.
     */
    public static final int MAX_FANS = 10;

    private Fan[] fans;
    private int operatingCapacity = 1;
    private boolean on = false;

    /**
     * Initialize a new cooling system of the given size.
     *
     * @param numberOfFans desired number of fans in this system
     */
    public CoolingSystem(int numberOfFans) {
        if (numberOfFans < 1) {
            numberOfFans = 1;
        }
        if (numberOfFans > MAX_FANS) {
            numberOfFans = MAX_FANS;
        }
        fans = new Fan[numberOfFans];
    }

    /**
     * Get the number of fans currently active.
     *
     * @return number of active fans
     */
    public int getOperatingCapacity() {
        return operatingCapacity;
    }

    /**
     * Set the number of active fans.
     *
     * @param operatingCapacity number of active fans (minimum 1)
     */
    public void setOperatingCapacity(int operatingCapacity) {
        this.operatingCapacity = Math.max(1, Math.min(fans.length, operatingCapacity));
    }

    /**
     * Checks whether the system is on.
     *
     * @return true if the system is on, otherwise false
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Turns the system on/off as specified.
     *
     * @param on if true the system will turn on, if false the system will turn off
     */
    public void setOn(boolean on) {
        this.on = on;
        for (int i = 0; i < operatingCapacity; i++) {
            fans[i].setOn(on);
        }
        for (int i = operatingCapacity; i < fans.length; i++) {
            fans[i].setOn(false);
        }
    }

    /**
     * Gets the current fan speed for the system.
     *
     * @return current speed of the fans
     */
    public int getSpeed() {
        return fans[0].getSpeed();
    }

    /**
     * Sets the speed of all fans in the system.
     *
     * @param speed onie of {@code SLOW}, {@code MEDIUM}, or {@code FAST}
     */
    public void setSpeed(int speed) {
        for (int i = 0; i < fans.length; i++) {
            fans[i].setSpeed(speed);
        }
    }

    /**
     * Increases the operating capacity by one, if possible.
     */
    public void turnUp() {
        if (operatingCapacity < fans.length)
            operatingCapacity++;
    }

    /**
     * Decreases the operating capacity by one, to a minimum of {@code 1}.
     */
    public void turnDown() {
        if (operatingCapacity > 1)
            operatingCapacity--;
    }
}
