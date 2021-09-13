package core;

import builders.EstimateBuilder;
import entities.Estimates;
import entities.Traffic;
import resources.OrbitType;
import resources.VehicleType;
import resources.WeatherType;

import java.util.ArrayList;
import java.util.List;

public class TravelHelper {

    private final List<Estimates> sample;

    public TravelHelper() {
        sample = new ArrayList<>();
    }

    public Estimates estimate(Traffic traffic) {
        sample.addAll(calculateBasedOnOrbit(traffic.getWeatherType(), OrbitType.ORBIT_1, traffic.getSpeedOfOrbit1()));
        sample.addAll(calculateBasedOnOrbit(traffic.getWeatherType(), OrbitType.ORBIT_2, traffic.getSpeedOfOrbit2()));
        sample.sort(Estimates.timeComparator);

        return sample.get(0);
    }

    private float estimateTimeWithVehicle(VehicleType vehicleType, int distance, float craters, int speed) {
        int vehicleMaxSpeed = Math.min(vehicleType.getSpeed(), speed);
        float time = (float) distance / vehicleMaxSpeed;
        float timeForCraters = vehicleType.getTimeForOneCrater() * craters;
        return (float) (timeForCraters + (time * 60.0));
    }

    private List<Estimates> calculateBasedOnOrbit(WeatherType weatherType, OrbitType orbitType, int speed) {

        List<Estimates> calculate = new ArrayList<>();

        float finalCraters = (float) (orbitType.getCraters() + ((orbitType.getCraters() * weatherType.getCraterReduction()) / 100));
        for (VehicleType type : weatherType.getUsableVehicles()) {
            calculate.add(new EstimateBuilder()
                    .withOrbitType(orbitType)
                    .withVehicleType(type)
                    .withTime(estimateTimeWithVehicle(type, orbitType.getDistance(), finalCraters, speed))
                    .build());
        }

        return calculate;
    }

}