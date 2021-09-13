import core.Travel;
import org.testng.annotations.Test;
import resources.WeatherType;

import java.io.FileNotFoundException;

public class TravelTests {

    @Test
    public void test1() throws FileNotFoundException {
        new Travel(System.getProperty("user.dir") + "\\src\\test\\resources\\input1.txt").suggest();
    }

    @Test
    public void test2() throws FileNotFoundException {
        new Travel(System.getProperty("user.dir") + "\\src\\test\\resources\\input2.txt").suggest();
    }

    @Test
    public void test3() throws FileNotFoundException {
        new Travel(System.getProperty("user.dir") + "\\src\\test\\resources\\input3.txt").suggest();
    }

    @Test
    public void test4() throws FileNotFoundException {
        new Travel(System.getProperty("user.dir") + "\\src\\test\\resources\\input4.txt").suggest();
    }

}