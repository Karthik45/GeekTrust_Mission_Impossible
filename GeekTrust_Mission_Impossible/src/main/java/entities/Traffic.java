package entities;

import resources.WeatherType;

public class Traffic {

    private WeatherType weatherType;

    private int speedOfOrbit1;

    private int speedOfOrbit2;

    public WeatherType getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(WeatherType weatherType) {
        this.weatherType = weatherType;
    }

    public int getSpeedOfOrbit1() {
        return speedOfOrbit1;
    }

    public void setSpeedOfOrbit1(int speedOfOrbit1) {
        this.speedOfOrbit1 = speedOfOrbit1;
    }

    public int getSpeedOfOrbit2() {
        return speedOfOrbit2;
    }

    public void setSpeedOfOrbit2(int speedOfOrbit2) {
        this.speedOfOrbit2 = speedOfOrbit2;
    }
}
