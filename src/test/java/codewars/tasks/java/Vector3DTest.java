package codewars.tasks.java;
import codewars.tasks.java.vector.Vector3D;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Vector3DTest {

    @Test (testName = "19", description = "Verify Vector 3D method")
    public void testCountVectorLength(){

        System.out.println("@Test - testCountVectorLength");

        Vector3D vector3D = new Vector3D();

        assertThat(vector3D.getLength(0,2,0)).isEqualTo(2.0);
    }
}
