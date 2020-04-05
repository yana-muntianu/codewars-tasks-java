package codewars.tasks.java;

import codewars.tasks.java.playingwithcubes.Cube;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PlayingWithCubesTest {

    @Test
    public static void TestGetAccessor()
    {
        Cube c = new Cube();
        assertEquals(0, c.side, "The get-accessor should return 0");
    }

  @Test
    public static void TestSetAccessor()
    {
        Cube c = new Cube();
        c.side = 5;
        assertEquals(5, c.side, "The set-accessor should have changed Side to 5");
    }
}
