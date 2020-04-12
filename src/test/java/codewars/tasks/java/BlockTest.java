package codewars.tasks.java;

import codewars.tasks.java.block.Block;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BlockTest {

    @Test (testName = "4", description = "Verify block volume and surface calculation")
    public void testBasicBlock(){

        System.out.println("@Test - testBasicBlock");
        Block b = new Block(new int[]{2,2,2});

        assertThat(b.getVolume()).isEqualTo(8);
        assertThat(b.getSurfaceArea()).isEqualTo(24);
    }
}

