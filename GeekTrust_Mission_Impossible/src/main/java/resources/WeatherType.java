package resources;

public enum WeatherType {

    SUNNY("SUNNY", -10, new VehicleType[]{VehicleType.CAR, VehicleType.BIKE, VehicleType.TUKTUK}),
    RAINY("RAINY", 20, new VehicleType[]{VehicleType.CAR, VehicleType.TUKTUK}),
    WINDY("WINDY", 0, new VehicleType[]{VehicleType.CAR, VehicleType.BIKE});

    private final String name;
    private final int craterReduction;
    private final VehicleType[] usableVehicles;

    private WeatherType(String name, int craterReduction, VehicleType[] usableVehicles) {
        this.name = name;
        this.craterReduction = craterReduction;
        this.usableVehicles = usableVehicles;
    }

    public int getCraterReduction() {
        return craterReduction;
    }

    public VehicleType[] getUsableVehicles() {
        return usableVehicles;
    }

    public String getName() {
        return name;
    }

    public static WeatherType fromString(String text) {
        for (WeatherType type : WeatherType.values()) {
            if (type.getName().equalsIgnoreCase(text)) {
                return type;
            }
        }
        return null;
    }
}
