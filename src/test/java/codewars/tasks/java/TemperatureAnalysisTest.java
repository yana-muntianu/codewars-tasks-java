package codewars.tasks.java;

import codewars.tasks.java.temperatureanalysis.TemperatureAnalysis;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TemperatureAnalysisTest {

    @Test(testName = "17", description = "Get the lowest temperature from the list")
    public void testGetLowestTemperature(){

        System.out.println("@Test - testGetLowestTemperature");

        TemperatureAnalysis analysis = new TemperatureAnalysis();

        assertThat(analysis.lowestTemperature("18 19 26 35")).isEqualTo(18);
        assertThat(analysis.lowestTemperature("-2 5 18 0")).isEqualTo(-2);
        assertThat(analysis.lowestTemperature("")).isEqualTo(0);
    }
}
