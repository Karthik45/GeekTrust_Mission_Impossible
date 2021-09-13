package builders;

import entities.Estimates;
import resources.OrbitType;
import resources.VehicleType;

public class EstimateBuilder {

    private final Estimates estimates;

    public EstimateBuilder() {
        estimates = new Estimates();
    }

    public EstimateBuilder withOrbitType(OrbitType type) {
        estimates.setOrbitType(type);
        return this;
    }

    public EstimateBuilder withVehicleType(VehicleType type) {
        estimates.setVehicleType(type);
        return this;
    }

    public EstimateBuilder withTime(float time) {
        estimates.setTime(time);
        return this;
    }

    public Estimates build() {
        return estimates;
    }
}
