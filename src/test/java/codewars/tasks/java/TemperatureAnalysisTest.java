package codewars.tasks.java;

import codewars.tasks.java.temperatureAnalysis.TemperatureAnalysis;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TemperatureAnalysisTest {

    @Test (testName = "12", description = "Get the lowest temperature from the list")
    public void testGetLowestTemperature() throws Exception{

        TemperatureAnalysis analysis = new TemperatureAnalysis();
        assertEquals(18, analysis.lowestTemperature("18 19 26 35"));
        assertEquals(-2, analysis.lowestTemperature("-2 5 18 0"));
        assertEquals(0, analysis.lowestTemperature(""), "There is no value");
    }
}
