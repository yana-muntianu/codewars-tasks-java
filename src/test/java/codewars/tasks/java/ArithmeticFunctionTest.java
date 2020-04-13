package codewars.tasks.java;

import codewars.tasks.java.arithmeticfunction.ArithmeticFunction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArithmeticFunctionTest {

    private static final Logger Log = LogManager.getLogger(ArithmeticFunctionTest.class.getName());

    @Test (testName = "1.1", description = "Verify 'add' function")
    public void testAddFunction() {

        Log.info("@Test - testAddFunction()");
        assertThat(ArithmeticFunction.arithmetic(1, 2, "add")).isEqualTo(3);
    }

    @Test (testName = "1.2", description = "Verify 'subtract' function")
    public void testSubtractFunction() {

        Log.info("@Test - testSubtractFunction()");
        assertThat(ArithmeticFunction.arithmetic(8, 2, "subtract")).isEqualTo(6);
    }

    @Test (testName = "1.3", description = "Verify 'multiply' function")
    public void testMultiplyFunction() {

        Log.info("@Test - testMultiplyFunction()");
        assertThat(ArithmeticFunction.arithmetic(5, 2, "multiply")).isEqualTo(10);
    }

    @Test (testName = "1.4", description = "Verify 'divide' function")
    public void testDivideFunction() {

        Log.info("@Test - testDivideFunction()");
        assertThat(ArithmeticFunction.arithmetic(8, 2, "divide")).isEqualTo(4);

    }
}
