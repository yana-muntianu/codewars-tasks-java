package codewars.tasks.java.arithmeticfunction;

public class ArithmeticFunction {

    /*
    Given two numbers and an arithmetic operator (the name of it, as a string),
    return the result of the two numbers having that operator used on them.
    a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.
    The four operators are "add", "subtract", "divide", "multiply".
     */
    public static int arithmetic(int a, int b, String operator) {
        int result = 0;

        switch (operator){
            case "add" : result = a + b;
                break;

            case "subtract" : result = a - b;
                break;

            case "multiply" : result = a * b;
                break;

            case "divide" : result = a / b;
                break;

            default:
                throw new IllegalArgumentException("Invalid argument: " + operator);

        }
        return result;
    }
}
