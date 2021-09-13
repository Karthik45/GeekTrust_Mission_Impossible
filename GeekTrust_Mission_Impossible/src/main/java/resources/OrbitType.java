package resources;

public enum OrbitType {

    ORBIT_1("ORBIT1", 18, 20), ORBIT_2("ORBIT2", 20, 10);

    private final String name;
    private final int distance;
    private final int craters;

    private OrbitType(String name, int distance, int craters) {
        this.name = name;
        this.distance = distance;
        this.craters = craters;
    }

    public int getDistance() {
        return distance;
    }

    public int getCraters() {
        return craters;
    }

    public String getName() {
        return name;
    }
}
