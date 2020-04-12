package codewars.tasks.java;

import codewars.tasks.java.decodemorsecode.MorseCodeDecoder;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class MorseCodeDecoderTest {

    @Test(testName = "12", description = "Verify Morse code decoder")
    public void testExampleFromDescription() {

        System.out.println("@Test - testExampleFromDescription");

        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")).isEqualTo("HEY JUDE");
    }
}
