package cooling;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private boolean on = false;
    private int speed = 0;
    private int radius = 5;
    private String color = "blue";
    public Fan() {}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String toString() {
        if (isOn()) {
            return "cooling.Fan is on: speed=" + speed + ", color=" + color + ", radius=" + radius;
        } else {
            return "cooling.Fan is off: color=" + color + ", radius=" + radius;
        }
    }
}
