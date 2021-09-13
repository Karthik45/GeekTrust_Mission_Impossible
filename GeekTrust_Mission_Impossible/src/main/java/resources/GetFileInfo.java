package resources;

import entities.Traffic;
import builders.TrafficBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetFileInfo {

    File myObj;

    public GetFileInfo(String fileName) {
        myObj = new File( fileName);
    }

    public Traffic getTrafficData() throws FileNotFoundException {
        Scanner myReader = new Scanner(myObj);
        String data = null;
        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
        }
        String[] data1 = data.split(" ");
        return new TrafficBuilder().withWeatherType(WeatherType.fromString(data1[0]))
                .withSpeedOfOrbit1(Integer.parseInt(data1[1]))
                .withSpeedOfOrbit2(Integer.parseInt(data1[2]))
                .build();
    }

}
