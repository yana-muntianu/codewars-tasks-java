package codewars.tasks.java;

import codewars.tasks.java.vector.Vector3D;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Vector3DTest {

    private static final Logger LOG = LogManager.getLogger(Vector3DTest.class.getName());

    @Test (testName = "19", description = "Verify Vector 3D method")
    public void testCountVectorLength(){

        LOG.info("@Test - testCountVectorLength()");

        Vector3D vector3D = new Vector3D();

        assertThat(vector3D.getLength(0,2,0)).isEqualTo(2.0);
    }
}
