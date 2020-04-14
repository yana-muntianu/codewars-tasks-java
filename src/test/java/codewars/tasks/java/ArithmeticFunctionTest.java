package codewars.tasks.java;


import codewars.tasks.java.arithmeticFunction.ArithmeticFunction;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArithmeticFunctionTest {

    @Test (testName = "9", description = "Verify Arithmetic function")
    public void testArithmeticFunction() {
        assertEquals( 3, ArithmeticFunction.arithmetic(1, 2, "add"));
        assertEquals(6, ArithmeticFunction.arithmetic(8, 2, "subtract"));
        assertEquals(10, ArithmeticFunction.arithmetic(5, 2, "multiply"));
        assertEquals(4, ArithmeticFunction.arithmetic(8, 2, "divide"));
    }
}
