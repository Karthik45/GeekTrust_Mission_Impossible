package resources;

public enum VehicleType {

    CAR(20, 3, 3), BIKE(10, 2, 1), TUKTUK(12, 1, 2);

    private final int speed;
    private final int timeForOneCrater;
    private final int priority;

    private VehicleType(int speed, int timeForOneCrater, int priority) {
        this.speed = speed;
        this.timeForOneCrater = timeForOneCrater;
        this.priority = priority;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTimeForOneCrater() {
        return timeForOneCrater;
    }

    public int getPriority() {
        return priority;
    }
}
