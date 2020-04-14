package codewars.tasks.java;

import codewars.tasks.java.decodemorsecode.MorseCodeDecoder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MorseCodeDecoderTest {

    private static final Logger LOG = LogManager.getLogger(MorseCodeDecoderTest.class.getName());

    @Test(testName = "12", description = "Verify Morse code decoder")
    public void testExampleFromDescription() {

        LOG.info("@Test - testExampleFromDescription()");

        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")).isEqualTo("HEY JUDE");
    }
}
