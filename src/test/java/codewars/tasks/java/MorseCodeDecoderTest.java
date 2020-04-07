package codewars.tasks.java;

import codewars.tasks.java.decodemorsecode.MorseCodeDecoder;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MorseCodeDecoderTest {

        @Test
        public void testExampleFromDescription() {
            assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
        }

}
