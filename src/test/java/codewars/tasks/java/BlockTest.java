package codewars.tasks.java;
import codewars.tasks.java.block.Block;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class BlockTest {

    @Test (testName = "2", description = "Verify Leap Year method")
        public void testBasicBlock() throws Exception {
            Block b = new Block(new int[]{2,2,2});
            assertEquals(8,b.getVolume());
            assertEquals(24,b.getSurfaceArea());
        }
    }

