package entities;

import resources.OrbitType;
import resources.VehicleType;

import java.util.Comparator;

public class Estimates {

    private VehicleType vehicleType;
    private OrbitType orbitType;
    private float time;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public OrbitType getOrbitType() {
        return orbitType;
    }

    public void setOrbitType(OrbitType orbitType) {
        this.orbitType = orbitType;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public int getVehiclePriorityOrder() {
        return vehicleType.getPriority();
    }

    public static final Comparator<Estimates> timeComparator = new Comparator<Estimates>() {
        @Override
        public int compare(Estimates o1, Estimates o2) {
            return Float.compare(o1.getTime(), o2.getTime());
        }
    };
}
