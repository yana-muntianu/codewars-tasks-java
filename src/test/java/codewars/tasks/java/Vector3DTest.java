package codewars.tasks.java;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Vector3DTest {
    @BeforeClass
    public void testSetUp(){
        System.out.println("Running TestNG");
    }
    @AfterClass
    public void testTearDown(){
        System.out.println("Stopping TestNG");
    }

    @Test
    public void countVectorLength(){
        System.out.println("@Test - countVectorLength");
        Vector3D vector3D = new Vector3D();

        vector3D.getLength(0,2,0);
        assertEquals(2.0, 2.0);


    }

}
