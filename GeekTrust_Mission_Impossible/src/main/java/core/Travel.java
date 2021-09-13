package core;

import entities.Estimates;
import resources.GetFileInfo;

import java.io.FileNotFoundException;

public class Travel {

    TravelHelper travelHelper;
    GetFileInfo file;

    public Travel(String fileName) {
        travelHelper = new TravelHelper();
        file = new GetFileInfo(fileName);
    }

    public void suggest() throws FileNotFoundException {
        Estimates fin = travelHelper.estimate(file.getTrafficData());
        System.out.println(fin.getVehicleType() + " " + fin.getOrbitType().getName());
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Travel(args[0]).suggest();
    }
}