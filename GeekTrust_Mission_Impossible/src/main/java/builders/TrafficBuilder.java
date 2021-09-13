package builders;

import entities.Traffic;
import resources.WeatherType;

public class TrafficBuilder {

    private final Traffic traffic;

    public TrafficBuilder() {
        traffic = new Traffic();
    }

    public TrafficBuilder withWeatherType(WeatherType type) {
        traffic.setWeatherType(type);
        return this;
    }

    public TrafficBuilder withSpeedOfOrbit1(int speed) {
        traffic.setSpeedOfOrbit1(speed);
        return this;
    }

    public TrafficBuilder withSpeedOfOrbit2(int speed) {
        traffic.setSpeedOfOrbit2(speed);
        return this;
    }

    public Traffic build() {
        return traffic;
    }
}
